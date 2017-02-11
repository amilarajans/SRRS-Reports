package com.origins.controller;

import com.origins.dao.GenericDAO;
import com.origins.dao.KeyValue;
import com.origins.dao.SearchData;
import com.origins.util.DateUtil;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.types.UInteger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.origins.domain.tables.Reservations.RESERVATIONS;
import static com.origins.domain.tables.Resources.RESOURCES;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.trueCondition;

/**
 * Created by Amila-Kumara on 03/02/2017.
 */
@Controller
public class PastReservationController {

	private DSLContext dsl;
	private DateUtil dateUtil;

	public PastReservationController(DSLContext dsl, DateUtil dateUtil) {
		this.dsl = dsl;
		this.dateUtil = dateUtil;
	}

	@ModelAttribute("allResource")
	public List<KeyValue<Integer>> allResource() {
		List<KeyValue<Integer>> keyValues = new ArrayList<>();
		keyValues.add(new KeyValue(-1, "All"));
		dsl.selectFrom(RESOURCES).fetch()
				.stream().forEach(r -> keyValues.add(new KeyValue(r.getId(), r.getName())));
		return keyValues;
	}

/*
    @ModelAttribute("allUsers")
    public List<KeyValue<Integer>> allUsers() {
        List<KeyValue<Integer>> keyValues = new ArrayList<>();
        keyValues.add(new KeyValue(-1, "All"));
        dsl.selectFrom(Users.USERS).fetch()
                .stream().forEach(r -> keyValues.add(new KeyValue(r.getId(), r.getName())));
        return keyValues;
    }
*/

	@RequestMapping("/passedReservations")
	public String init(final ModelMap modelMap) {
		modelMap.addAttribute("searchData", new SearchData());
		return "passedReservations";
	}

	@RequestMapping(value = "/passedReservations", params = {"search"})
	public String searchData(final ModelMap modelMap, final SearchData searchData) {

		List<GenericDAO> dataList = new ArrayList<>();

		Condition condition = trueCondition();

		if (searchData.getResource() != -1) {
			condition = condition.and(RESOURCES.ID.equal(UInteger.valueOf(searchData.getResource())));
		}
		if (searchData.getStartDate() != null) {
			condition = condition.and(RESERVATIONS.START.greaterOrEqual(Timestamp.valueOf(searchData.getStartDate().atStartOfDay())));
		}
		if (searchData.getEndDate() != null) {
			condition = condition.and(RESERVATIONS.START.lessOrEqual(Timestamp.valueOf(searchData.getEndDate().atStartOfDay())));
		}

		List<LocalDateTime> daysList = dateUtil.getDaysBetween(searchData.getStartDate().atTime(0, 0, 0, 0), searchData.getEndDate().atTime(0, 0, 0, 0))
				.collect(Collectors.toList());

		List<String> days = daysList.stream().map(DateUtil::getFormatedDate).collect(Collectors.toList());

		Result<Record> fetch = dsl.select(count(RESERVATIONS.RESOURCE_ID).as("count"))
				.select(RESERVATIONS.fields())
				.select(RESOURCES.fields())
				.from(RESERVATIONS)
				.innerJoin(RESOURCES)
				.on(RESERVATIONS.RESOURCE_ID.equal(RESOURCES.ID))
				.where(condition)
				.groupBy(RESERVATIONS.RESOURCE_ID, RESERVATIONS.START, RESERVATIONS.END)
				.fetch();

		System.out.println(fetch);
		final List<Map> mapList = new ArrayList<>();

		//|id|resource_id|user_id|name|address|nic_number|conact_number|email_address|start|end|created_at|updated_at|id|category_id|name|location|description|created_at|updated_at|
		//|0 |1          |2      |3   |4      |5         |6            |7            |8    |9  |10        |11        |12|13         |14  |15      |16         |17        |18        |
		fetch.stream().forEach(i -> {
			Map<String, Object> map = new HashMap<>();
			List<Integer> data = new ArrayList<>();
			map.put("name", i.getValue(RESOURCES.NAME));

			LocalDateTime startDateTime = i.getValue(RESERVATIONS.START).toLocalDateTime().toLocalDate().atTime(0, 0, 0, 0);
			LocalDateTime endDateTime = i.get(RESERVATIONS.END).toLocalDateTime().toLocalDate().atTime(0, 0, 0, 0);

			dataList.add(new GenericDAO(i.getValue(RESOURCES.NAME), i.getValue(RESOURCES.LOCATION), startDateTime, endDateTime, ((Integer) i.getValue(0))));

			daysList.stream().forEach(day -> {
				LocalDateTime dateTime = day.toLocalDate().atTime(0, 0, 0, 0);
				if (startDateTime.equals(dateTime) || endDateTime.equals(dateTime) || (startDateTime.isBefore(dateTime) && endDateTime.isAfter(dateTime))) {
					data.add(((Integer) i.getValue(0)));
				} else {
					data.add(0);
				}
			});
			map.put("data", data);
			mapList.add(map);
		});
		modelMap.addAttribute("records", dataList);
		modelMap.addAttribute("days", days);
		modelMap.addAttribute("data", mapList);
		return "passedReservations";
	}

}
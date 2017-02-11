package com.origins.controller;

import com.origins.dao.GenericDAO;
import com.origins.dao.KeyValue;
import com.origins.dao.SearchData;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.types.UInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.origins.domain.tables.Reservations.RESERVATIONS;
import static com.origins.domain.tables.Resources.RESOURCES;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.trueCondition;

/**
 * Created by Amila-Kumara on 02/02/2017.
 */
@Controller
public class ResourcesAvailabilityInController {

	private final Logger logger = LoggerFactory.getLogger(ResourcesAvailabilityInController.class);

	private DSLContext dsl;

	public ResourcesAvailabilityInController(DSLContext dsl) {
		this.dsl = dsl;
	}

	@ModelAttribute("allResource")
	public List<KeyValue<Integer>> allResource() {
		List<KeyValue<Integer>> keyValues = new ArrayList<>();
		dsl.selectFrom(RESOURCES).fetch()
				.stream().forEach(r -> keyValues.add(new KeyValue(r.getId(), r.getName())));
		return keyValues;
	}

	@RequestMapping("/resourcesAvailabilityIn")
	@CrossOrigin(origins = "*")
	public String init(final ModelMap model) {

		model.addAttribute("searchData", new SearchData());

		return "resourcesAvailabilityIn";
	}

	@RequestMapping(value = "/resourcesAvailabilityIn", params = "search")
	@CrossOrigin(origins = "*")
	public String searchResource(final ModelMap model, final SearchData searchData) {
		List<GenericDAO> data = new ArrayList<>();

		Condition condition = trueCondition();

		LocalDate date = searchData.getStartDate();

		condition = condition.and(RESERVATIONS.START.lessOrEqual(Timestamp.valueOf(date.atStartOfDay())))
				.and(RESERVATIONS.END.greaterOrEqual(Timestamp.valueOf(date.atStartOfDay())))
				.and(RESERVATIONS.RESOURCE_ID.equal(UInteger.valueOf(searchData.getResource())));

		Result<Record> fetch = dsl.select(count(RESERVATIONS.RESOURCE_ID).as("count"))
				.select(RESERVATIONS.fields())
				.select(RESOURCES.fields())
				.from(RESERVATIONS)
				.innerJoin(RESOURCES)
				.on(RESERVATIONS.RESOURCE_ID.equal(RESOURCES.ID))
				.where(condition)
				.groupBy(RESERVATIONS.RESOURCE_ID, RESERVATIONS.START, RESERVATIONS.END)
				.fetch();

		logger.info(String.format("%n%s", fetch.toString()));

		fetch.stream().forEach(item -> data.add(new GenericDAO(item.getValue(RESOURCES.NAME), item.getValue(RESOURCES.LOCATION), item.getValue(RESERVATIONS.START).toLocalDateTime(), item.getValue(RESERVATIONS.END).toLocalDateTime())));

		model.addAttribute("data", data);

		return "resourcesAvailabilityIn";
	}

}
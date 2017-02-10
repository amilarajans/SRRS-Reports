package com.origins.controller;

import com.origins.dao.SearchData;
import com.origins.domain.tables.Users;
import com.origins.domain.tables.records.UsersRecord;
import com.origins.util.DateUtil;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.jooq.impl.DSL.trueCondition;

/**
 * Created by Amila-Kumara on 02/02/2017.
 */
@Controller
public class WelcomeController {

    @Value("${welcome.message:test}")
    private String message = "Hello World";

    private SearchData searchData;

    private DSLContext dsl;
    private DateUtil dateUtil;

    public WelcomeController(DSLContext dsl, DateUtil dateUtil) {
        this.dsl = dsl;
        this.dateUtil = dateUtil;
    }

    @RequestMapping("/")
    @CrossOrigin(origins = "*")
    public String welcome(final ModelMap model) {
        model.put("message", this.message);
        model.put("searchData", new SearchData());
        List<UsersRecord> result = dsl.selectFrom(Users.USERS).fetch();
//		result.stream().forEach(System.out::println);
        model.put("userList", result);
        return "welcome";
    }

    @RequestMapping(value = "/", params = {"search"})
    private String search(final ModelMap model, final SearchData searchData, final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "welcome";
        }
        Condition condition = trueCondition();
//        if (searchData.getName() != null) {
//            condition = condition.and(Users.USERS.ID.equal(UInteger.valueOf(searchData.getName())));
//        }


        System.out.println("clicked on search");
        model.put("message", "Search Result");
//        System.out.println(searchData.getName());
        List<UsersRecord> result;
//        if (searchData.getName() != null) {
//            result = dsl.selectFrom(Users.USERS).where(condition).fetch();
//        } else {
            result = dsl.selectFrom(Users.USERS).fetch();
//        }
        model.put("userList", result);
        return "welcome";
    }

}
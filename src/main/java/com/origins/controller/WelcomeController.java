package com.origins.controller;

import com.origins.domain.tables.User;
import org.jooq.DSLContext;
import org.jooq.Record3;
import org.jooq.Result;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Amila-Kumara on 02/02/2017.
 */
@Controller
public class WelcomeController {

    @Autowired
    private DSLContext dsl;

	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	@CrossOrigin(origins = "*")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		Result<Record3<UInteger, String, String>> result = dsl.select(User.USER.ID, User.USER.NAME, User.USER.EMAIL).from(User.USER).fetch();
		result.stream().forEach(item->{
			System.out.println(item.value1());
			System.out.println(item.value2());
			System.out.println(item.value3());
		});
		return "welcome";
	}

}
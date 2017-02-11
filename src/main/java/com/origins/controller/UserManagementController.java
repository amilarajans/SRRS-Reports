package com.origins.controller;

import com.origins.dao.SearchData;
import com.origins.domain.tables.records.UsersRecord;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.types.UInteger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.origins.domain.tables.Users.USERS;
import static org.jooq.impl.DSL.trueCondition;

/**
 * Created by Amila-Kumara on 02/02/2017.
 */
@Controller
public class UserManagementController {

	private DSLContext dsl;

	private static final String USER = "users";
	private static final String USER_ID = "userId";
	private Integer userId;

	public UserManagementController(DSLContext dsl) {
		this.dsl = dsl;
	}

	@RequestMapping("/userManagement")
	@CrossOrigin(origins = "*")
	public String init(final ModelMap model, @RequestParam(value = "id") Integer id) {
		model.addAttribute(USER, getUsers());
		this.userId = id;
		model.addAttribute(USER_ID, userId);
		model.addAttribute("searchData", new SearchData());
		return "userManagement";
	}

	@RequestMapping(value = "/userManagement", params = {"search"})
	@CrossOrigin(origins = "*")
	public String searchUser(final ModelMap model, final SearchData searchData) {
		model.addAttribute(USER, searchData(searchData));
		model.addAttribute(USER_ID, userId);
		return "userManagement";
	}

	@RequestMapping(value = "userManagement", params = {"delete"})
	public String removeUser(final ModelMap model, final SearchData searchData, @RequestParam(value = "delete", required = false) String email) {
		dsl.deleteFrom(USERS).where(USERS.EMAIL.equal(email)).execute();
		model.addAttribute(USER, searchData(searchData));
		model.addAttribute(USER_ID, userId);
		return "userManagement";
	}

	@RequestMapping(value = "userManagement", params = {"update"})
	public String updateUser(final ModelMap model, @RequestParam(value = "name") String userName, @RequestParam(value = "email") String email, @RequestParam(value = "id") Integer id) {
		if (userName != null && !userName.isEmpty()) {
			dsl.update(USERS).set(USERS.NAME, userName).where(USERS.ID.equal(UInteger.valueOf(id))).execute();
		}
		if (email != null && !email.isEmpty()) {
			dsl.update(USERS).set(USERS.EMAIL, email).where(USERS.ID.equal(UInteger.valueOf(id))).execute();
		}
		model.addAttribute(USER, getUsers());
		model.addAttribute(USER_ID, userId);
		return "userManagement";
	}

	protected Result<UsersRecord> searchData(SearchData searchData) {
		Condition condition = trueCondition();

		String userName = searchData.getUser();
		String email = searchData.getEmail();

		if (userName != null && !userName.isEmpty()) {
			condition = condition.and(USERS.NAME.likeIgnoreCase(String.format("%s%s%s", "%", userName, "%")));
		}
		if (email != null && !email.isEmpty()) {
			condition = condition.and(USERS.EMAIL.equal(email));
		}
		return dsl.selectFrom(USERS).where(condition).fetch();
	}

	protected Result<UsersRecord> getUsers() {
		return dsl.selectFrom(USERS).fetch();
	}

}
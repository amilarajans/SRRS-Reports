package com.origins.dao;

import com.origins.util.DateUtil;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Amila-Kumara on 06/02/2017.
 */
public class SearchData {
	private List<String> allTypes;
	private String type;
	private Integer resource;
	private String user;
	private LocalDate startDate;
	private LocalDate endDate;

	protected final DateUtil dateUtil;

	public SearchData() {
		dateUtil = new DateUtil();
		allTypes = Arrays.asList("Chart", "Table");
		endDate = LocalDate.now();
		startDate = endDate.plusMonths(-1);
	}

	public List<String> getAllTypes() {
		return allTypes;
	}

	public void setAllTypes(List<String> allTypes) {
		this.allTypes = allTypes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getResource() {
		return resource;
	}

	public void setResource(Integer resource) {
		this.resource = resource;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}

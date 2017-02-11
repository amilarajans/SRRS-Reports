package com.origins.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Amila-Kumara on 11/02/2017.
 */
public class GenericDAO {

	private String value1;
	private String value2;
	private String value3;
	private String value4;
	private LocalDate localDate1;
	private LocalDate localDate2;
	private LocalDateTime localDateTime1;
	private LocalDateTime localDateTime2;
	private Long long1;
	private Long long2;
	private Integer integer1;
	private Integer integer2;

	public GenericDAO(String value1, String value2, LocalDateTime localDateTime1, LocalDateTime localDateTime2, Integer integer1) {
		this.value1 = value1;
		this.value2 = value2;
		this.localDateTime1 = localDateTime1;
		this.localDateTime2 = localDateTime2;
		this.integer1 = integer1;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public String getValue3() {
		return value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}

	public String getValue4() {
		return value4;
	}

	public void setValue4(String value4) {
		this.value4 = value4;
	}

	public LocalDate getLocalDate1() {
		return localDate1;
	}

	public void setLocalDate1(LocalDate localDate1) {
		this.localDate1 = localDate1;
	}

	public LocalDate getLocalDate2() {
		return localDate2;
	}

	public void setLocalDate2(LocalDate localDate2) {
		this.localDate2 = localDate2;
	}

	public LocalDateTime getLocalDateTime1() {
		return localDateTime1;
	}

	public void setLocalDateTime1(LocalDateTime localDateTime1) {
		this.localDateTime1 = localDateTime1;
	}

	public LocalDateTime getLocalDateTime2() {
		return localDateTime2;
	}

	public void setLocalDateTime2(LocalDateTime localDateTime2) {
		this.localDateTime2 = localDateTime2;
	}

	public Long getLong1() {
		return long1;
	}

	public void setLong1(Long long1) {
		this.long1 = long1;
	}

	public Long getLong2() {
		return long2;
	}

	public void setLong2(Long long2) {
		this.long2 = long2;
	}

	public Integer getInteger1() {
		return integer1;
	}

	public void setInteger1(Integer integer1) {
		this.integer1 = integer1;
	}

	public Integer getInteger2() {
		return integer2;
	}

	public void setInteger2(Integer integer2) {
		this.integer2 = integer2;
	}
}

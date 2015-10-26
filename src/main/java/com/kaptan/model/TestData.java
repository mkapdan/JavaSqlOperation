package com.kaptan.model;

import java.util.Date;

public class TestData {

	private String name;

	private Integer age;

	private Date birthDate;

	public TestData(String name, Integer age, Date birthDate) {
		super();
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}

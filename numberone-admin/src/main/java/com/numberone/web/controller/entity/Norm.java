package com.numberone.web.controller.entity;

public class Norm {
   // return "[{'physicalTestId.year':'qqq','physicalTestId.name':'10','people.name':'777','people.sex':'10','people.unit.name':'29%','age':'45','people.position':'777','isReplace':'78','testResult':'2323'},         {'physicalTestId.year':'qqq','physicalTestId.name':'10','people.name':'777','people.sex':'10','people.unit.name':'29%','age':'45','people.position':'777','isReplace':'78','testResult':'2323'}]";

	private String physicalTestId_year;
	private String physicalTestId_name;
	private String people_name;
	private String people_sex;
	private String age;
	private String people_unit_name;
	private String people_position;
	private String physicalTestItemId_name;
	private String isReplace;
	private String testResult;
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhysicalTestItemId_name() {
		return physicalTestItemId_name;
	}
	public void setPhysicalTestItemId_name(String physicalTestItemId_name) {
		this.physicalTestItemId_name = physicalTestItemId_name;
	}
	
	public String getPhysicalTestId_year() {
		return physicalTestId_year;
	}
	public void setPhysicalTestId_year(String physicalTestId_year) {
		this.physicalTestId_year = physicalTestId_year;
	}
	public String getPhysicalTestId_name() {
		return physicalTestId_name;
	}
	public void setPhysicalTestId_name(String physicalTestId_name) {
		this.physicalTestId_name = physicalTestId_name;
	}
	public String getPeople_name() {
		return people_name;
	}
	public void setPeople_name(String people_name) {
		this.people_name = people_name;
	}
	public String getPeople_sex() {
		return people_sex;
	}
	public void setPeople_sex(String people_sex) {
		this.people_sex = people_sex;
	}
	public String getPeople_unit_name() {
		return people_unit_name;
	}
	public void setPeople_unit_name(String people_unit_name) {
		this.people_unit_name = people_unit_name;
	}
	public String getPeople_position() {
		return people_position;
	}
	public void setPeople_position(String people_position) {
		this.people_position = people_position;
	}
	public String getIsReplace() {
		return isReplace;
	}
	public void setIsReplace(String isReplace) {
		this.isReplace = isReplace;
	}
	public String getTestResult() {
		return testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	
}

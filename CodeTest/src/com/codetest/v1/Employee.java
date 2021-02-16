package com.codetest.v1;

import java.util.Date;

public class Employee {
	private String name;
	private String id;
	private Integer age;
	private Double salary;
	private String dept;
	private Date dateOfjoining;
	public Employee(String name, String id, Integer age, Double salary, String dept, Date dateOfjoining) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.dateOfjoining = dateOfjoining;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + ", dept=" + dept
				+ ", dateOfjoining=" + dateOfjoining + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getDateOfjoining() {
		return dateOfjoining;
	}
	public void setDateOfjoining(Date dateOfjoining) {
		this.dateOfjoining = dateOfjoining;
	}
	
	

}

package com.codetest.v1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StatisticsCourse {
	
	private List<Employee> employees;
	
	public StatisticsCourse() {
		super();
		employees.add(new Employee("Abc", "1", 41, 12334.90, "HR", null));
		employees.add(new Employee("Xyz", "2", 23, 12334.90, "HR", null));
		employees.add(new Employee("XABCyz", "3", 33, 12334.90, "HR", null));
		employees.add(new Employee("XCKyz", "4", 35, 12334.90, "HR", null));
	}

	public Map<String, String> getEmpMap(){
	 Map<String, String> result = this.employees.stream() .collect(Collectors.toMap(emp -> emp.getId(), emp -> emp.getName()));
	 return result;
	}
	
	public List<Employee> getAgeFilter(){
		
		 return  employees.stream()
	              .filter(e -> e.getAge() <40 && e.getAge() > 30)
	              .collect(Collectors.toList());
	}


		public List<Employee> getSortedEmps(){

				this.employees.sort(Comparator.comparing(e -> e.getName()));
				return this.employees;

			}}
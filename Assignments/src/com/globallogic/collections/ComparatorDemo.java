package com.globallogic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
}

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Employee> ls = new ArrayList<>();
		
		ls.add(new Employee(1,"Gaurav"));
		ls.add(new Employee(3, "Aman"));
		ls.add(new Employee(5, "Piyush"));
		ls.add(new Employee(2, "Vaibhav"));
		ls.add(new Employee(4, "Ishaan"));
		
		System.out.println(ls);
		
		//Collections.sort(ls,new ComparatorSortByID());
		
		Collections.sort(ls,new ComparatorSortByName());
		
		ls.forEach(System.out::println);
	}
}

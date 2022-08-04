package com.globallogic.Day9;

public class EmployeeDemo implements Comparable<EmployeeDemo> {

	private int id;
	private String name;
	private double salary;
	
	public EmployeeDemo(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

	@Override
	public int compareTo(EmployeeDemo o) {

		return this.getName().compareTo(o.getName());}
	
}

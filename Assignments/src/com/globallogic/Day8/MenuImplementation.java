package com.globallogic.Day8;

import java.util.*;

public class MenuImplementation {

	Scanner sc = new Scanner(System.in);

	ArrayList<Employee> empList = new ArrayList<>();

	public void addEmployee() {

		System.out.println("Enter employee id:");
		int id = sc.nextInt();

		System.out.println("Enter employee salary");
		int salary = sc.nextInt();

		System.out.println("Enter employee name");
		String name = sc.next();

		Employee emp = new Employee(id, name, salary);

		empList.add(emp);
		System.out.println("Data added successfully");
		System.out.println(empList);
	}

	public void deleteEmployee(String name) {

		boolean flag = false;
		int a = 0;
		for (Employee e : empList) {
			if (e.getName().equalsIgnoreCase(name)) {
				flag = true;
				break;
			} else {
				a++;
			}
		}
		if (flag) {
			empList.remove(a);
			System.out.println("Data deleted successfully!!!");
		} else {
			System.out.println("No such employee exists");
		}
	}

	public void searchEmployee(String name) {

		boolean flag = false;
		for (Employee e : empList) {
			if (e.getName().equalsIgnoreCase(name)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Employee Found!!!");
		} else {
			System.out.println("No such employee exists");
		}
	}

	public void updateEmployee(String empName, int id, int salary) {

		for (Employee e : empList) {
			if (e.getName().equalsIgnoreCase(empName)) {
				e.setId(id);
				e.setSalary(salary);
				System.out.println("Employee Data updated");

			}
		}
	}

	public void sortEmployees() {
		Collections.sort(empList, new SortByName());
		System.out.println(empList);
	}

	public double sumSalary() {
		double sum = 0;

		for (Employee e : empList) {
			sum = sum + e.getSalary();
		}
		return sum;
	}

	public int maxSalary() {

		int maxSal = Integer.MIN_VALUE;

		for (Employee e : empList) {
			if (maxSal < e.getSalary()) {
				maxSal = e.getSalary();
			}
		}
		return maxSal;
	}

	public int minSalary() {

		int minSal = Integer.MAX_VALUE;

		for (Employee e : empList) {
			if (minSal > e.getSalary()) {
				minSal = e.getSalary();
			}
		}
		return minSal;
	}

	public void seeList() {
		System.out.println(empList);
	}

}

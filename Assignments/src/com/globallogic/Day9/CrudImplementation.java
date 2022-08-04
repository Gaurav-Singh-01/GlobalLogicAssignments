package com.globallogic.Day9;

import java.util.*;

import com.globallogic.Day8.Employee;
import com.globallogic.Day8.SortByName;

public class CrudImplementation {

	Scanner sc = new Scanner(System.in);

	Set<EmployeeDemo> empSet = new TreeSet<>();

	public void addEmployee() {

		System.out.println("Enter employee id:");
		int id = sc.nextInt();

		System.out.println("Enter employee name:");
		String name = sc.next();

		System.out.println("Enter employee salary:");
		double sal = sc.nextDouble();

		empSet.add(new EmployeeDemo(id, name, sal));
		System.out.println("Data added successfully!!!");
		System.out.println(empSet);
	}

	public void deleteEmployee(String name) {

		boolean flag = false;
		int a = 0;
		Iterator<EmployeeDemo> it = empSet.iterator();
		while (it.hasNext()) {

			EmployeeDemo e = it.next();

			if (e.getName().equalsIgnoreCase(name)) {
				flag = true;
				empSet.remove(e);
				break;
			}
		}
		if (flag) {
			System.out.println("Data deleted successfully!!!");
			System.out.println(empSet);
		} else {
			System.out.println("No such employee exists");
		}
	}

	public void searchEmployee(String name) {

		boolean flag = false;
		Iterator<EmployeeDemo> it = empSet.iterator();
		while (it.hasNext()) {
			EmployeeDemo e = it.next();
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

	public void sortEmployees() {
		//Collections.sort((List<EmployeeDemo>) empSet);
		System.out.println(empSet);
	}
}

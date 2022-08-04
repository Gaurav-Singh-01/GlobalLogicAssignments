package com.globallogic.Day9;

import java.util.Collections;
import java.util.Scanner;

import com.globallogic.Day8.MenuImplementation;

public class CrudOperationsMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = 1;
		CrudImplementation ci = new CrudImplementation();

		while (c == 1) {

			System.out.println("---------- Menu!!!!----------");
			System.out.println("1. Add the employee to list ");
			System.out.println("2. Delete the employee from list ");
			System.out.println("3. Search the employee name ");
			System.out.println("4. Sort the data of employee ");

			int ch;
			System.out.println("Enter your choice");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				ci.addEmployee();
				break;

			case 2:
				System.out.println("Enter the name of employee to be deleted");
				String name = sc.next();
				ci.deleteEmployee(name);
				break;

			case 3:
				System.out.println("Enter the name of employee to be searched");
				String empName = sc.next();
				ci.searchEmployee(empName);
				break;
				
			case 4:
				System.out.println("Sorted set is:");
				ci.sortEmployees();
				break;
				

			default:
				System.out.println("Invalid Choice!!!!");

			}
			
			System.out.println("If u want to come out of menu enter 0 otherwise to continue press 1");

			int a = sc.nextInt();

			if (a == 1) {
				c = 1;
			} else {
				c = 0;
			}

		}

	}

}

package com.globallogic.Day8;

import java.util.Scanner;

/*
 * Create a List with student class and perform the following operation
 * 
1. Add the employee to list
2. Delete the employee from list
3. Search the employee name
4. Update the employee value using name 
5. Sort the data of employee
6. Provide the sum of salary of employee
7 search for highest paid salary
8 search for minimum paid salary
create a menu base program for above problem
 */
public class ListAssignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = 1;
		MenuImplementation mi = new MenuImplementation();

		while (c == 1) {

			System.out.println("---------- Menu!!!!----------");
			System.out.println("1. Add the employee to list ");
			System.out.println("2. Delete the employee from list ");
			System.out.println("3. Search the employee name ");
			System.out.println("4. Update the employee value using name ");
			System.out.println("5. Sort the data of employee ");
			System.out.println("6. Provide the sum of salary of employee ");
			System.out.println("7. Search for highest paid salary ");
			System.out.println("8. Search for minimum paid salary ");
			System.out.println("9. See the list ");

			int ch;
			System.out.println("Enter your choice");
			ch = sc.nextInt();


			switch (ch) {

			case 1:
				mi.addEmployee();
				break;

			case 2:
				System.out.println("Enter the name of employee to be deleted");
				String name = sc.next();
				mi.deleteEmployee(name);
				break;

			case 3:
				System.out.println("Enter the name of employee to be searched");
				String empName = sc.next();
				mi.searchEmployee(empName);
				break;

			case 4:
				System.out.println("Enter the name of employee to be updated whose id and salary is to be updated");
				String empNam = sc.next();
				System.out.println("Enter the updated id:");
				int id = sc.nextInt();
				System.out.println("Enter the updated salary:");
				int sal = sc.nextInt();
				mi.updateEmployee(empNam, id, sal);
				break;

			case 5:
				System.out.println("Sorting to be done");
				mi.sortEmployees();
				break;

			case 6:
				System.out.println("Sum of salary of all employees is " + mi.sumSalary());
				break;

			case 7:
				System.out.println("Highest paid salary is " + mi.maxSalary());
				break;

			case 8:
				System.out.println("Minimum paid salary is " + mi.minSalary());
				break;
				
			case 9:
				mi.seeList();
				break;

			default:
				System.out.println("Invalid Choice!!!!");

			}
			
			System.out.println("If u want to come out of menu enter 0 otherwise to continue press 1");
			
			int a = sc.nextInt();
			
			if(a == 1) {
				c = 1;
			}
			else {
				c = 0;
			}
				
		}

	}

}

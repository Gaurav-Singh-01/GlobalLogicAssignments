package com.globallogic.day5;

import java.util.Scanner;

//create an array of object of student type and create and store 10 object and print 10 object value.

public class ArrayObject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student s[] = new Student[10];
		
		

		for (int i = 0; i < 10; i++) {
			
			System.out.println("Enter the Student Id:");
			int id = sc.nextInt();
			
			
			System.out.println("Enter the Student Age:");
			int age = sc.nextInt();
			
			System.out.println("Enter the Student Name:");
			String name = sc.next();
			
			sc.nextLine();
			
			Student st = new Student();
			st.setId(id);
			st.setAge(age);
			st.setName(name);
			
			s[i]=st;	
		}
		
		for(Student student:s) {
			System.out.println("Student id is "+student.getId()+".Student name is "+student.getName()+".Student age is "
					+ student.getAge()+".");
		
		}
	}

}

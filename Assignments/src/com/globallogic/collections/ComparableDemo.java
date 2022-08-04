package com.globallogic.collections;

import java.util.*;

class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
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
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		//for sorting On name(string) basis
		//return this.getName().compareTo(o.getName());
		
		//for other cases sorting like id ,salary use below concept.
		if(this.getId() < o.getId())
			return 1;
		else if(this.getId() > o.getId())
			return -1;
		else
			return 0;
		
	}
	
	
	
}

public class ComparableDemo {

	public static void main(String[] args) {

		List<Student> ls = new ArrayList<>();
		
		ls.add(new Student(1,"Gaurav"));
		ls.add(new Student(2, "Aman"));
		ls.add(new Student(3, "Piyush"));
		ls.add(new Student(4, "Vaibhav"));
		ls.add(new Student(5, "Ishaan"));
		
		Collections.sort(ls,Collections.reverseOrder());
		
		System.out.println(ls);
		
		ls.forEach(System.out::println);
	}

}

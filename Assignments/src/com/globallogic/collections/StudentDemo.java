package com.globallogic.collections;


//Create a Student with with 5 paramters and make this class generic

public class StudentDemo<A, B, C, D, E> {

	@Override
	public String toString() {
		return "StudentDemo [name=" + name + ", sub=" + sub + ", roll=" + roll + ", city=" + city + ", age=" + age
				+ "]";
	}

	private A name;
	private B sub;
	private C roll;
	private D city;
	private E age;

	public StudentDemo(A name, B sub, C roll, D city, E age) {
		super();
		this.name = name;
		this.sub = sub;
		this.roll = roll;
		this.city = city;
		this.age = age;
	}

	public void print() {
		System.out.println("Name is " + name);
		System.out.println("Subject is " + sub);
		System.out.println("Roll no is " + roll);
		System.out.println("City is " + city);
		System.out.println("Age is " + age);
	}

	public static void main(String[] args) {

		StudentDemo<String, String, String, String, String> s1 = new StudentDemo<String, String, String, String, String>
		("Gaurav","CSE", "50", "Lucknow", "21");
		StudentDemo<String, String, Integer, String, Integer> s2 = new StudentDemo<String, String, Integer, 
				String, Integer>("Aman","ME", 55, "Delhi", 24);
		s1.print();
		s2.print();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}

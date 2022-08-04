package com.globallogic.classTraining;

public class Student {
	
	private int id,age;
	private String name,branch;
	private float fees;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", branch=" + branch + ", fees=" + fees + "]";
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(1);
		s.setName("Amit");
		s.setBranch("CSE");
		s.setAge(22);
		s.setFees(400000.00f);
		
		System.out.println(s);
		
		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName());
		System.out.println("Age is "+s.getAge());
		
		System.out.println("Branch is "+s.getBranch());
		System.out.println("Fees is "+s.getFees());
	}
	

}

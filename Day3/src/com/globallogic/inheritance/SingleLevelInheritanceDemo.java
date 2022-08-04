package com.globallogic.inheritance;

class Vehicle {

	private String type, color;


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void print() {
		System.out.println("Type is "+type);
		System.out.println("Color is "+color);
	}
}

class Car extends Vehicle{
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showDetails() {
		System.out.println("Name of car is "+name);
	}
	
	
	
}

public class SingleLevelInheritanceDemo {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.setType("Four Wheeler");
		c.setColor("BLACK");
		c.setName("XUV700");
		
		c.print();
		c.showDetails();

	}

}

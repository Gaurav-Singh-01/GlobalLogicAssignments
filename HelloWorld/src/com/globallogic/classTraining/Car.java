package com.globallogic.classTraining;

public class Car {
	
	private String name,color,company,origin;
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	


	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", company=" + company + ", origin=" + origin + ", price="
				+ price + "]";
	}

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setName("Fortuner");
		c.setColor("Black");
		c.setCompany("Toyota");
		c.setOrigin("Thailand");
		c.setPrice(4500000.00f);
		
		System.out.println(c);
		
		
		System.out.println("Name is "+c.getName());
		System.out.println("Color is "+c.getColor());
		System.out.println("Company is "+c.getCompany());
		System.out.println("Origin is "+c.getOrigin());
		System.out.println("Price is "+c.getPrice());
	}

}

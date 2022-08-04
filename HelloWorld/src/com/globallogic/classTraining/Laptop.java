package com.globallogic.classTraining;

public class Laptop {

	private String name,type,color;
	private float price,ram;
	
	
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


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


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public float getRam() {
		return ram;
	}


	public void setRam(float ram) {
		this.ram = ram;
	}


	public static void main(String[] args) {

		
		Laptop lap = new Laptop();
		
		lap.setName("HP");
		lap.setType("Windows");
		lap.setColor("Grey");
		lap.setPrice(100000.0f);
		lap.setRam(32);
		
		System.out.println(lap);
		
		System.out.println("Name is "+lap.getName());
		System.out.println("Type is "+lap.getType());
		System.out.println("Color is "+lap.getColor());
		System.out.println("Price is "+lap.getPrice());
		System.out.println("Ram is "+lap.getRam()+"GB");
	}

}

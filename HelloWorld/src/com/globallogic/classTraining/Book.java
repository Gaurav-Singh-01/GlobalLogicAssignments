package com.globallogic.classTraining;

public class Book {
	
	private int id,edition;
	private String bName,bAuthor;
	private double price;
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", edition=" + edition + ", bName=" + bName + ", bAuthor=" + bAuthor + ", price="
				+ price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	public static void main(String[] args) {

		Book b = new Book();
		
		b.setId(23);
		b.setbName("Hamlet");
		b.setbAuthor("William Shakespeare");
		b.setEdition(1);
		b.setPrice(3456.87);
		
		System.out.println(b);
		System.out.println("Id is "+b.getId());
		System.out.println("Name is "+b.getbName());
		System.out.println("Author name is "+b.getbAuthor());
		System.out.println("Edition is "+b.getEdition());
		System.out.println("Price is "+b.getPrice());
	}

}

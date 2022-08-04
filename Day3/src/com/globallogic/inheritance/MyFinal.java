package com.globallogic.inheritance;


class Parent{
	
	public void printA() {
		System.out.println("Print A");
	}
}

class Child extends Parent{

	public void printB() {
		System.out.println("Print B");
	}
}


public class MyFinal {

	public static void main(String[] args) {

		
		
	}

}


//final keyword with class--> that class cannot be extended or inherited

//final keyword with variable-->value cannit be changed

//final keyword with method-->method overriding not possible for that method
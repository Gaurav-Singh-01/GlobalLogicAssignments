package com.globallogic.inheritance;

class A {

	public void printA() {
		System.out.println("INSIDE A");
	}

}

class B extends A {

	public void printB() {
		System.out.println("INSIDE B");
	}
}

class C extends B{
	
	public void printC() {
		System.out.println("INSIDE C");
	}
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {

		C c = new C();
		c.printA();
		c.printB();
		c.printC();
	}

}

package com.globallogic.inheritance;

class X {

	public void printX() {
		System.out.println("INSIDE X");
	}

}


class Y extends X {

	public void printY() {
		System.out.println("INSIDE Y");
	}
}

class Z extends X{
	
	public void printZ() {
		System.out.println("INSIDE Z");
	}
}


public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		
		
		Y y = new Y();
		y.printX();
		y.printY();
		
		System.out.println();
		
		Z z = new Z();
		z.printX();
		z.printZ();
		
		

	}

}

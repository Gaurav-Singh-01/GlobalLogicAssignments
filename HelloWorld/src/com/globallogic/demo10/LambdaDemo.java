package com.globallogic.demo10;

@FunctionalInterface
interface SumDemo {

	public int sum(int a, int b);
}

@FunctionalInterface
interface PrintDemo {

	public void print();
}

public class LambdaDemo {

	public static void main(String[] args) {

		SumDemo demo = (a, b) -> {

			return a + b;
		};

		System.out.println("Sum is "+demo.sum(20, 42));

		PrintDemo p = () -> {
			System.out.println("Print");
		};

		p.print();
	}

}

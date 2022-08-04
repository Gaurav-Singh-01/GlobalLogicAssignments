package com.globallogic.lambda;

public class LambdaAssignment {

	public static void main(String[] args) {

		// Create a lambda to find the even and odd value

		System.out.println("************Ques 1*************");

		EvenOdd e = (n) -> {
			if (n % 2 == 0) {
				System.out.println(n+" is a even no.");
			} else {
				System.out.println(n+" is a odd no.");
			}
		};

		e.evenOddCheck(5);
		e.evenOddCheck(6);

		System.out.println();

		System.out.println("************Ques 2*************");

		// create a lambda to find the largest number

		LargestNumDemo ln = (a, b) -> {

			if (a > b) {
				System.out.println(a + " is the larger no.");
			} else {
				System.out.println(b + " is the larger no.");
			}
		};
		ln.greatestNum(3, 6);

		System.out.println();

		System.out.println("************Ques 3*************");

		// create a lambda to find the min number

		SmallestNumDemo sn = (a, b) -> {

			if (a > b) {
				System.out.println(b + " is the smaller no.");
			} else {
				System.out.println(a + " is the smaller no.");
			}
		};
		sn.smallestNum(3, 6);

		System.out.println();

		System.out.println("************Ques 4*************");

		// create a lambda to print the hello world

		PrintDemo1 p1 = () -> {
			System.out.println("Hello World");
		};
		p1.print();

		System.out.println();

		System.out.println("************Ques 5*************");

		// create a lambda to print the sum of 1 to 100 number

		SumOneToTen stt = () -> {
			int sum = 0;
			for(int i=1;i<=100;i++) {
				sum = sum + i;
			}
			System.out.println("Sum of numbers from 1 to 100 are : "+sum);
		};
		stt.sumNo();
		
		System.out.println();

		System.out.println("************Ques 6*************");

		// create a lambda to find the number is positive or negative
		
		PositiveNegative pn = (x) ->{
			if(x > 0) {
				System.out.println(x+" is a positive number.");
			}
			else {
				System.out.println(x+" is a negative number.");
			}
		};
		pn.check(6);
		pn.check(-3);
		
		System.out.println();

		System.out.println("************Ques 7*************");

		// create a lambda to change string to upper case
		
		StringToUpper stu = (s) -> System.out.println(s.toUpperCase());
		
		stu.change("hello world");
		
		
		System.out.println();

		System.out.println("************Ques 8*************");

		// create a lambda to find the number's squareroot
		
		SquareRoot sr = (z) -> Math.sqrt(z);
		
		System.out.println("Square root is "+sr.find(25));
		

	}

}

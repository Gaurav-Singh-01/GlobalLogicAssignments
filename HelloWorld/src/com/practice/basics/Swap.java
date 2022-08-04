//Java program for swapping two numbers
package com.practice.basics;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");

		int a = sc.nextInt();
		
		System.out.println("Enter second number");

		int b = sc.nextInt();
		
		System.out.println("Before Swapping "+" a = "+a+" b = "+b);
		
		int temp = 0;
		
		//Using third variable
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping "+" a = "+a+" b = "+b);
		
		
		//Without using third variable
		
		System.out.println("Enter first number");

		int c = sc.nextInt();
		
		System.out.println("Enter second number");

		int d = sc.nextInt();
		
		System.out.println("Before Swapping "+" c = "+c+" d = "+d);
		
		c = c + d;
		d = c - d;
		c = c - d;
		
		System.out.println("After Swapping "+" c = "+c+" d = "+d);
		
		

	}

}

package com.practice.basics;

import java.util.Scanner;

//write a program to give the color code and print the color name  //switch and if else ladders

public class ColorCodeUsingIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the color code");

		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("RED");
		}
		
		else if(n == 2) {
			System.out.println("BLUE");
		}
		
		else if(n == 3) {
			System.out.println("GREEN");
		}
		
		else if(n == 4) {
			System.out.println("BLACK");
		}
		
		else if(n == 5) {
			System.out.println("VIOLET");
		}
		
		else if(n == 6) {
			System.out.println("WHITE");
		}
		
		else  {
			System.out.println("ORANGE");
		}
	}

}

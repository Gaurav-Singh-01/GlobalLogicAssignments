package com.practice.basics;

import java.util.Scanner;

//write a program to give the color code and print the color name  //switch and if else ladders

public class ColorCodeUsingSwitch {

	public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the color code");
		
		int code=sc.nextInt();
		
		switch(code) {
		
		case 1:
			System.out.println("RED");
			break;
		
		case 2:
			System.out.println("BLUE");
			break;
		
		
		case 3:
			System.out.println("GREEN");
			break;
		
		
		case 4:
			System.out.println("BLACK");
			break;
		
		case 5:
			System.out.println("VIOLET");
			break;
		
		case 6:
			System.out.println("WHITE");
			break;
		
		case 7:
			System.out.println("VIOLET");
			break;
			
		default:
			System.out.println("INVALID CHOICE!!!");
	}
	}

}

//Java Program to reverse the letters present in the given String
package com.practice.basics;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");

		String str = sc.nextLine();
		
		String str1 = "";
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			str1 = c + str1;
		}
		System.out.println("Reversed String is "+str1);
	}

}

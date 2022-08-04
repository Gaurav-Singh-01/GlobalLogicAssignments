package com.globallogic.StringDemo;

public class StringDemo {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		String str4 = str3;
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		
		String str5 = "hello";
		System.out.println(str1 == str5);
		str1 = str5;
		System.out.println(str1 == str5);
	}

}

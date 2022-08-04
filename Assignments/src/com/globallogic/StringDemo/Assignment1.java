package com.globallogic.StringDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Write a program to print a string entered by user.

		// Write a program to input and display the sentence I love candies.

		System.out.println("--------------QUES 1 & 2------------------------");

		System.out.println("Enter a string");

		String str = sc.nextLine();

		System.out.println(str);
		System.out.println();

		System.out.println("--------------QUES 3------------------------");
		// Write a program to find the length of the string "refrigerator".

		String str2 = "refrigerator";
		System.out.println("Length is " + str2.length());

		System.out.println();

		System.out.println("--------------QUES 4------------------------");

		// Write a program to check if the letter 'e' is present in the word 'Umbrella'.

		String str3 = "Umbrella";

		if (str3.indexOf('e') != -1) {
			System.out.println("e is present");
		} else {
			System.out.println("e is not present");
		}

		System.out.println();

		System.out.println("--------------QUES 5------------------------");

		// Write a program to check if the word 'orange' is present in the "This is
		// orange juice".

		String str4 = "This is orange juice ";
		String str5 = "";
		int flag = 0;
		for (int i = 0; i < str4.length(); i++) {
			char ch = str4.charAt(i);
			if (ch != ' ') {
				str5 = str5 + ch;
			} else {
				if (str5.equals("orange")) {
					flag = 1;
					break;
				} else {
					flag = 0;
					str5 = "";
				}
			}
		}
		if (flag == 1) {
			System.out.println("Orange is present");
		} else {
			System.out.println("Orange is not present");
		}

		System.out.println();

		System.out.println("--------------QUES 6------------------------");

		// Write a program to find the first and the last occurence of the letter 'o'
		// and character ','
		// in "Hello, World".

		String str6 = "Hello, World.";
		System.out.println("Start index of O is " + str6.indexOf('o'));
		System.out.println("Last index of O is " + str6.lastIndexOf('o'));
		System.out.println("Start index of , is " + str6.indexOf(','));
		System.out.println("Start index of , is " + str6.lastIndexOf(','));

		System.out.println();

		System.out.println("--------------QUES 7------------------------");

		// Write a program to find out the largest and smallest word in the string "This
		// is an umbrella".

		String string = "This is an umbrella";
		String word = "", small = "", large = "";
		String[] words = new String[100];
		int length = 0;

		string = string + " ";

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				word = word + string.charAt(i);
			} else {
				words[length] = word;
				length++;
				word = "";
			}
		}

		small = large = words[0];

		for (int k = 0; k < length; k++) {

			if (small.length() > words[k].length())
				small = words[k];

			if (large.length() < words[k].length())
				large = words[k];
		}

		System.out.println("Smallest word: " + small);
		System.out.println("Largest word: " + large);

		System.out.println();

		System.out.println("--------------QUES 8------------------------");

		// Write a program to check if a given string is a Palindrome.

		System.out.println("Enter a string");
		String palin = sc.nextLine();
		boolean palindrome = false;

		for (int i = 0; i < palin.length(); i++) {
			char ch1 = palin.charAt(i);
			char ch2 = palin.charAt(palin.length() - (i + 1));
			if (ch1 != ch2) {
				palindrome = false;
				break;
			} else {
				palindrome = true;
			}
		}
		if (palindrome) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

		System.out.println();

		System.out.println("--------------QUES 9------------------------");

		/*
		 * Write a program to replace a given substring in a sentence with another
		 * string. For example, in the sentence, ” A batman with bat” if we replace
		 * ”bat” with ”snow”, the new sentence should be printed as ”A snowman with
		 * snow”.
		 */

		String replaceExample = "A batman with bat ";
		System.out.println(replaceExample);
		System.out.println(replaceExample.replaceAll("bat", "snow"));

		System.out.println();

		System.out.println("--------------QUES 10------------------------");

		/*
		 * Write a program to reverse individual words in a string, where each word may
		 * be delimited by a dot, comma, space or tab, like www.google.com should become
		 * www.elgoog.moc.
		 */

		String strw = "www.google.com.";
		String updatedString = "";
		String strw1 = "";
		String strw2 = "";
		int c = 0;

		for (int i = 0; i < strw.length(); i++) {
			char chr = strw.charAt(i);
			if (chr != '.' || chr != ',' || chr != ' ') {
				strw1 = strw1 + chr;
				strw2 = chr + strw2;
			} else {
				c++;
				System.out.println(strw2);
				updatedString = updatedString + strw2;
			}
		}
		if (c == 0) {
			System.out.println(strw);
		} else {
			System.out.println(updatedString);
		}

		System.out.println();

		System.out.println("--------------QUES 11------------------------");

		/*
		 * Input a string which contains some palindrome substrings. Find out the
		 * position of palindrome substrings if exist and replace it by (For example if
		 * input string is “bob has a radar plane” then it should convert in “*** has a
		 * ***** plane”.
		 */

	}

}

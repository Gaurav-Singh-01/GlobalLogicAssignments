package com.globallogic.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int check = 1;
		while (check == 1) {

			System.out.println("*******MENU DRIVEN PROGRAM********");
			System.out.println("1- LINEAR SEARCH USING ARRAY");
			System.out.println("2- LINEAR SEARCH USING LIST");

			System.out.println("ENTER YOUR CHOICE!!!!!");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("ENTER THE LIMIT");
				int n = sc.nextInt();
				System.out.println("ENTER THE ELEMENTS");
				int arr[] = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
				System.out.println("ENTER THE ELEMENT TO BE SEARCHED:");
				int find = sc.nextInt();

				boolean flag = false;
				int a = 0;
				for (int i = 0; i < n; i++) {
					if (arr[i] == find) {
						a = i;
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println(find + " is found at position - " + (a + 1));
				} else {
					System.out.println(find + " does not exist in the array");
				}
				break;

			case 2:
				List<Integer> ls = new ArrayList<Integer>();

				int flag1 = 1;
				while (flag1 == 1) {
					System.out.println("INSERT A NUMBER");
					int num = sc.nextInt();
					ls.add(num);
					System.out.println("DO YOU WANT ADD MORE NUMBERS PRESS 1 TO CONTINUE OR 0 TO DISCONTINUE:");
					int check1 = sc.nextInt();
					if (check1 == 1)
						flag1 = 1;
					else
						flag1 = 0;
				}
				System.out.println("ENTER THE ELEMENT TO BE SEARCHED:");
				int find1 = sc.nextInt();

				boolean flag2 = false;
				int k = 0;
				for (int i = 0; i < ls.size(); i++) {
					if (ls.get(i) == find1) {
						k = i;
						flag2 = true;
						break;
					}
				}
				if (flag2) {
					System.out.println(find1 + " is found at position - " + (k + 1));
				} else {
					System.out.println(find1 + " does not exist in the list");
				}
				break;

			default:
				System.out.println("INVALID CHOICE!!!!");

			}
			System.out.println("If u want to come out of menu enter 0 otherwise to continue press 1");

			int a = sc.nextInt();

			if (a == 1) {
				check = 1;
			} else {
				check = 0;
			}
		}
	}

}

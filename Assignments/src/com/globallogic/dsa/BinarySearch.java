package com.globallogic.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int check = 1;
		while (check == 1) {

			System.out.println("*******MENU DRIVEN PROGRAM********");
			System.out.println("1- BINARY SEARCH USING ARRAY");
			System.out.println("2- BINARY SEARCH USING LIST");

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

				Arrays.sort(arr);
				int l = 0;
				int u = arr[n - 1];

				int mid = (l + u) / 2;
				boolean flag = false;
				while (l < u) {
					if (arr[mid] == find) {
						flag = true;
						break;
					} else if (arr[mid] > find)
						l = l + 1;
					else
						u = u - 1;
				}
				if (flag) {
					System.out.println(find + " is found at position - " + (mid + 1));
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
				System.out.println(ls);
				System.out.println(ls.get(0));
				System.out.println("ENTER THE ELEMENT TO BE SEARCHED:");
				int find1 = sc.nextInt();

				Collections.sort(ls);
				int lower = 0;
				int upper = ls.size() - 1;

				int middle = (lower + upper) / 2;
				boolean flag2 = false;
				int x = 0;
				while (lower < upper) {
					if (ls.get(middle) == find1) {
						x = middle;
						flag2 = true;
						break;
					} else if (ls.get(middle) > find1)
						lower = lower + 1;
					else
						upper = upper - 1;
				}
				if (flag2) {
					System.out.println(find1 + " is found at position - " + (x + 1));
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

package com.globallogic.collections;

/*Create List of Student and perform the below operation : Add the data ,delete ,update ,remove , 
sort the list and print.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListDemo {

	public static void main(String[] args) {

		/*
		 * ArrayList<String> list = new ArrayList<>();
		 * 
		 * //adding elements list.add("Gaurav"); list.add("Aman"); list.add("Amit");
		 * list.add("Piyush");
		 * 
		 * System.out.println(list);
		 * 
		 * //removing or deleting elements list.remove("Aman");
		 * System.out.println(list);
		 * 
		 * 
		 * //updating element list.set(2,"Hello"); System.out.println(list);
		 * 
		 * 
		 * //sorting list Collections.sort(list); System.out.println(list);
		 */

		ArrayList<String> ls = new ArrayList<String>();
		// add method is use to add the value to list
		ls.add("ravinder");
		ls.add("kumar");
		ls.add("ajay");
		ls.add("zee");

		java.util.Iterator<String> it = ls.iterator();
		// it will check there is any next element is there or not
		// it will return true if there is any element
		// it will return false if there is not element

		Collections.sort(ls);

		while (it.hasNext()) {
			// String element=it.next();
			System.out.println("element is " + it.next());
		}

	}

}

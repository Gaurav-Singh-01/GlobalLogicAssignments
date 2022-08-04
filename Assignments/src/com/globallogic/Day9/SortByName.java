package com.globallogic.Day9;

import java.util.Comparator;

public class SortByName implements Comparator<EmployeeDemo>{

	@Override
	public int compare(EmployeeDemo o1, EmployeeDemo o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

package com.globallogic.collections;

import java.util.Comparator;

public class ComparatorSortByID implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		//for sorting On name(string) basis
				//return this.getName().compareTo(o.getName());
				
				//for other cases sorting like id ,salary use below concept.
				if(o1.getId() < o2.getId())
					return 1;
				else if(o1.getId() > o2.getId())
					return -1;
				else
					return 0;

	
	}
	
	

}

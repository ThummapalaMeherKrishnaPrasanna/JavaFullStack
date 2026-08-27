package com.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2){
	
		return st2.name.compareTo(st1.name);
	}
	
}

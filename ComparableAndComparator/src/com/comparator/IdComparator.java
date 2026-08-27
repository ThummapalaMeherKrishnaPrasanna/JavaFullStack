package com.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
		
		return st1.id - st2.id;
	}
	

}

package com;

import java.util.List;
import java.util.ArrayList;

public class ArrayListPract {

	public static void main(String[] args) {
		
		System.out.println("==========================");
		
		ArrayList list = new ArrayList();
		
		Employee emp = new Employee(18, "Meher", "Software Enginer");
		
		list.add(123);
		list.add(18);
		System.out.println(list.get(1));
		list.add("FLM");
		list.add(emp);
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		Employee employee = (Employee) list.get(3);
		
		System.out.println(employee.getName());
		
		System.out.println("==========================");

		ArrayList<Integer> list2 = new ArrayList<>();
		
		System.out.println("--add--12 at 0");
		list2.add(12);
		list2.add(30);

		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		System.out.println("--add--40-- at 2");
		list2.add(2,40);
		System.out.println(list2);
		
		
		System.out.println("--set--20-- at 1");
		list2.set(1,20);
		System.out.println(list2);
		
		
		System.out.println("--remove--12-- at 1");
		list2.remove(0);
		System.out.println(list2);
		
		System.out.println("--remove--20 by content at 1");
		list2.remove(Integer.valueOf(20));
		System.out.println(list2);
		
		list2.add(50);
		
		List<Integer> list3 = new ArrayList<>();
		System.out.println("--addAll--");
		list3.addAll(list2);
		System.out.println(list3.add(60));
		System.out.println(list3.add(80));
		System.out.println(list3);
		
		System.out.println("--indexOf--at--0");
		System.out.println(list3.indexOf(40));
		
		System.out.println();
		list3.add(1,80);
		System.out.println(list3);
		
		System.out.println("--lasrIndexOf-- of 80");
		System.out.println(list3.lastIndexOf(80));
		
		System.out.println("check list3 empty return true if not return false");
		System.out.println(list3.isEmpty());
		
		
		System.out.println("clear will remove all the data in the list");
		list3.clear();
		System.out.println(list3.isEmpty());
		
	}

}

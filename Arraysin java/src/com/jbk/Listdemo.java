package com.jbk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		

		list.add(101);
		list.add(107);
		list.add(103);
		list.add(108);
		list.add(106);
		list.add(106);
		
		//list.addAll(list);
		
		///sequencing with duplicate value
		Collections.sort(list);
		
	System.out.println(list);	
	
	
	
   List<String> student=new ArrayList<>();
	
	student.add("ajay");
	student.add("shri");
	student.add("vik");
	student.add("shgd");
	student.add("kj");
	student.add("kgk");
	
	System.out.println(student);	
	}

}

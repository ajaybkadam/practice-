package com.jbk;

import java.util.ArrayList;


public class Arraylist {
public static void main(String[]args){
	
	ArrayList<String> student=new ArrayList<>();
	
	student.add("ajay");
	student.add("shri");
	student.add("vik");
	student.add("shgd");
	student.add("kj");
	student.add("kgk");
	
	//update the element using index value
	student.set(2, "sho");
	//to search element using index number
	student.contains(5);
	//to clear the element
	//student.clear();
	//to remove element
	student.remove(4);
	//to get a number
	student.get(3);
	
		
System.out.println(student);			
}

		
}

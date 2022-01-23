package com.jbk;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		
          set.add(501);
          set.add(501);
          set.add(505);
          set.add(507);
          set.add(500);
          set.add(509);
          set.add(508);
          //remove the element
          set.remove(505);
          //contains the element
          set.contains(505);
          
     System.out.println(set);       
          
       Set<String> tree=new HashSet<>();
	
      tree.add("ajay");
      tree.add("vidya");
      tree.add("prem");
      tree.add("shri");
      tree.add("ganesh");
      
 
   
System.out.println(tree);       
          
	}

}

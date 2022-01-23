package com.jbk;

public class SingleDimensinal {

	public static void main(String[] args) {
	/*
  int a[]=new int[10];///Dynamic Initialization of class
 
  a[0]=44;  
  a[1]=45;
  a[2]=50;
  a[3]=60;
  a[4]=55;
  a[5]=65;
  a[6]=66;
  a[7]=41;
  a[8]=49;
  a[9]=11;
 
  a[0]=88;///if we update the value the current will be print
 System.out.println(a[0]);
 System.out.println(a[2]);
 
  
 ////to print all values or elements we required for-loop
 
 for(int i=0;i<a.length;i++){
	 System.out.println(a[i]);
	
	 */
	 
	int arr[]={33,55,66,55,1233}; ///for static Initialization of class
	
	for(int k=0;k<arr.length;k++){   ///Sorting by using For-Loop
		System.out.println(arr[k]);	
	}
	 
	for(int i:arr){               ///for enhanced array
		                            ///Sorting by using For-Each 
		System.out.println(i);
		
	}
 }
 
 	
	}



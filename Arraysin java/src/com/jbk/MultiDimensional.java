package com.jbk;

public class MultiDimensional {

	public static void main(String[] args) {
		
		int a[][]= new int[3][3];//[row][column]   3D array   FOR Dynamic 
		                                                     
		a[0][0]=42;                                        
		a[0][1]=33;
		a[0][2]=12;
		a[1][0]=45;
		a[1][1]=39;
		a[1][2]=14;
		a[2][0]=49;
		a[2][1]=31;
		a[2][2]=20;
		/* 
		
		int a[][]={                       ///for Static 
				{42,33,12},
		        {45,39,14},
		        {49,31,20}
		           };
	*/

		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a.length;j++){
				
			System.out.print(" "+ a[i][j]);    ///print() is for horizontal AND println() is for vertical
			                                   
				
			}
			System.out.println();
		}
		
	}

}

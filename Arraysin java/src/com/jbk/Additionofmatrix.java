package com.jbk;

public class Additionofmatrix {

	public static void main(String[] args) {
	/*
		int a[][]=new int[3][3];
		
		a[0][0]=42;                                        
		a[0][1]=33;
		a[0][2]=12;
		a[1][0]=45;
		a[1][1]=39;
		a[1][2]=14;
		a[2][0]=49;
		a[2][1]=31;
		a[2][2]=20;
		
		 
	  int b[][]=new int[3][3];
	  
		a[0][0]=40;                                        
		a[0][1]=88;
		a[0][2]=56;
		a[1][0]=89;
		a[1][1]=90;
		a[1][2]=101;
		a[2][0]=409;
		a[2][1]=320;
		a[2][2]=201;
		
	*/
		int a[][]={{46,58,55},
				   {59,51,54},
		           {60,61,63}
		};
		
		
		int b[][]={{52,63,66},
				   {12,9,6},
				   {50,51,53}
		};
		
		
		//creating another matrix to store the sum of two matrices  
	 
		int c[][]=new int[3][3];
		//adding and printing addition of 2 matrices  
		
		for(int i=0;i<a.length;i++){
			
			
			for(int j=0;j<b.length;j++){
				
				 c[i][j]=a[i][j]+b[i][j];
				
				System.out.print(c[i][j]+" ");
			}
		
			System.out.println();
		}
		
	}

}

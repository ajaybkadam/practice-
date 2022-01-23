package com.jbk;

public class Muliplicationmatrix {

	public static void main(String[] args) {
		
		///Multiplication of two matrix is possible only when number of rows of m1 matrices   is equals to number of  columns of m2 matrix 

		int m1[][]={{1,2,3},
				    {4,5,6},
		};
		
		int m2[][]={{7,8},
				    {9,10},
				    {11,12}
		};
		
		int c[][]=new int[2][2];
		
		for(int i=0;i<m1.length;i++){
			
			for(int j=0;j<m2.length;j++){
				c[i][j]=0;
				for(int k=0;k<3;k++){
				c[i][j]+=m1[i][k]*m2[k][j];
				}
				System.out.print(c[i][j]+" ");
				
				}
			System.out.println();
			}
		}
		
		}
		
		
	



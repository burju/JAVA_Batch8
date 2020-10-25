package com.syntax.GroupExercises_Burcu;
/*
 * Create a 2D array to store numbers and calculate sum of all odd numbers. 
 */
public class Task08 {
	
	public static void main(String[] args) {
		
		int[][] array2= new int[3][3];
		//assign random vars to the 2d array: 
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j]= (int)(Math.random()*100);
				System.out.printf( "%3d", array2[i][j]);
				if( (j+1)%3==0)
					System.out.println();
			}}
		// scan the array for odd numbers and calculate the sum of all odd numbers
			int sum=0;
			for (int j = 0; j < array2.length; j++) {
				for (int j2 = 0; j2 < array2[j].length; j2++) {
					 if(array2[j][j2]% 2==1) {
						 sum+=array2[j][j2];
						 
					 }
					
				}
				
			} System.out.println("sum of all odd numbers are:" + sum);
			
		}
		
	}



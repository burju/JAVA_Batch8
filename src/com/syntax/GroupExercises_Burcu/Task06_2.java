package com.syntax.GroupExercises_Burcu;
/*
 * Write a java program to check whether a given number is prime or not?
6.Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.
*/


public class Task06_2 {
	public static void main(String[] args) {
		
	double [][] array= new double[3][3];
	
	// /assign random values to the 2D array:
	double sum=0;
	
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			array[i][j]= (int)(Math.random()*100);
			sum+=array[i][j];
			System.out.print(array[i][j]+ " | ");
			if((j+1)%3==0) {
				System.out.println();
			}
		}
	}
	
	
	System.out.println("\nThe sum of all values on the 2D array is: " + sum);
	// now the values are assigned. We can sum all the elements on the
	}
}
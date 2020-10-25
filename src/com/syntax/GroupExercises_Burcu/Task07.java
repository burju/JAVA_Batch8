package com.syntax.GroupExercises_Burcu;
/*
 * Create a 2D array to store numbers in 3 rows and 4 columns. 
 * Develop a program which will identify/print the even numbers only.
 */
public class Task07 {
public static void main(String[] args) {

double [][] array= new double[3][4];
	
	// /assign random values to the 2D array:

	
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			array[i][j]= (int)(Math.random()*100);
			System.out.print(array[i][j]+ " | ");
			if((j+1)%4==0) {
				System.out.println();
			}
		}
	}
	
	int sum=0;
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			if( array[i][j] %2==0) {
				sum+=array[i][j];
			}
		}
	}  
	System.out.println("The sum of all even elements in the array is:" + sum);
	
	
}
}

package com.syntax.GroupExercises_Burcu;
/*
 * Write a java program to find the second largest number in the array?
 */
public class Task05 {
public static void main(String[] args) {
	
	//create an array:
	int[] array = new int[10];
	for (int i = 0; i < 10; i++) {
		array[i] = (int) (Math.random() * 100);
		System.out.print(array[i] + " ");
	}
	int max1 = array[0];
	int min_number = array[0];

	// find the max number
	for (int i = 1; i < array.length; i++) {
		if (max1 < array[i]) {
			max1 = array[i];
		}
	}
	// find the second max number
	int max2= array[0];
	
	for (int i = 0; i < array.length; i++) {
		if(array[i]>max2 && array[i]<max1) {
			max2=array[i];
		}
	}
	System.out.print("\nThe second largest number in the array is " + max2);
}
}

package com.syntax.GroupExercises_Burcu;
/*
 * Maximum and minimum number in the array?
 */

public class Task04 {
	public static void main(String[] args) {

		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		int max_number = array[0];
		int min_number = array[0];

		// find the max number
		for (int i = 1; i < array.length; i++) {
			if (max_number < array[i]) {
				max_number = array[i];
			}
		}
		for (int i = 1; i < array.length; i++) {
			if (min_number > array[i]) {
				min_number = array[i];
			}
		} 
		// I could have merge these 2 for loops under 1 For loop and link 2 conditions with if&else if
		System.out.println("\nThe max number in the array is:" + max_number);
		System.out.println("The min number in the array is:" + min_number);
	}
}

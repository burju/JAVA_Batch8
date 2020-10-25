package com.syntax.class11;

public class Task01 {
public static void main(String[] args) {
	int[] array = {10, 0 , 20, 8, -1, 77, 56};
	
	int largest=array[0]; // we dont assign 0 because we dont know whether the numbers are negative etc
	
	for (int i = 0; i < array.length; i++) {
		if( array[i]>largest) {
			largest= array[i];
		}
	}
	System.out.println("the largest num is: " + largest);
}
}

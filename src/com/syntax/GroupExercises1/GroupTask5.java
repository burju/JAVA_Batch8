package com.syntax.GroupExercises1;

public class GroupTask5 {
	public static void main(String[] args) {
	

		//create an array:
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		
		int largest=0;
		int secondLargest=0; 
		
		for(int i=0; i<array.length;i++) {
			if(array[i]>largest) {
			largest=array[i];
				
			} else if(array[i]>secondLargest) {
				secondLargest=array[i];
				
			}
		}
		System.out.println("The second largest number is "+secondLargest);
		
	}

}

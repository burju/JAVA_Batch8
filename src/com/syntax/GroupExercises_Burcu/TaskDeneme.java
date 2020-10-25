package com.syntax.GroupExercises_Burcu;

public class TaskDeneme {
public static void main(String[] args) {
	
	int num=9; 
	int i=2;
	 
	while (i<num) {
		if (num%i==0) {
			System.out.println("The number" +num+ "is not prime number");
			i++;
			break;
			
		}else {
			System.out.println("The number" +num+ " is a prime number");
			i++; 
			break;
			
		}
	
		
	}
}
}

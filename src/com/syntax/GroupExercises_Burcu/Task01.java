package com.syntax.GroupExercises_Burcu;
/*
 * Write a program to swap 2 numbers without a temporary variable? 
 * Swap  2 strings without a temporary variable?
 */
public class Task01 {

	public static void main(String[] args) {
	
		int a = 1;
		int b=2;
		System.out.println("The value of num1 & num2 before swapping is.\na:" + a  + " & b:" + b);
		
		int x= a + b;
		
		a = x-a ;
		b= x-a ;
		
		System.out.println("The value of num1 & num2 after swapping is. \na:" + a  + " & b:" + b);
		
			
		
		
	}
}

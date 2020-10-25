package com.syntax.GroupExercises_Burcu;

import java.util.Scanner;

/*
 * 2. Write a java program to check whether a given number is prime or not?
 * 
 */
public class Task02 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the number you want to check whether its a prime number or not");
		int number= input.nextInt();
		
		Boolean isPrime= false;
		for (int i = 2; i < number; i++) {
			if(number%i!=0 || number==2) {
				isPrime=true;
				}
			else {
				isPrime= false;
				break;}
			}
		if(isPrime) {	
		System.out.println("The number is a prime number");
		}		
		else {
			System.out.println("The number is not a prime number");
		}
		
	}
}

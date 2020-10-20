package com.syntax.class08;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	
	System.out.println("TASK 1:");
	//Print numbers from 1 to 50 except those that are divisible by 3
	for (int i = 1; i <=50; i++) {
		if(i%3==0) {
			continue;
	}	else {
		System.out.print(i + " ");
	}}
	System.out.println();
	
//Create a program that will keep asking user to apply for a credit card.
	//As soon you get “yes” from a user program should stop asking.
	Scanner input=new Scanner(System.in);
	System.out.println("\nTASK:2");
	System.out.println("\nDo you want to apply for a Credit Card? (yes/no)");
	String answer=input.next();
	 while(answer.equalsIgnoreCase("yes")|| !answer.equals("no") || answer.equalsIgnoreCase("no")) {
		 if( answer.equalsIgnoreCase("yes")) {
			 System.out.println("Thank you for applying!You wont regret!");
			 break;
		 }
		 System.out.println("our rates are so good you cannot resist. Do you want to apply for a credit card?");
		 answer=input.next();
		
	 }
	 
	 
	 
	
	}
}


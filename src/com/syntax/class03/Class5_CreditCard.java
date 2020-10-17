package com.syntax.class03;

import java.util.Scanner;

public class Class5_CreditCard {
	public static void main(String[] args) {
		

	Scanner userInput = new Scanner(System.in);
	boolean answer;
	double balance;
	answer.equals;
	
	char gender;
	
	System.out.println("what is your gender? m/f");
	gender=userInput.next().charAt(0);
	if(gender.toLowerCase) {
		
	}
	System.out.println("Please enter true if you have a credit card");
	answer = userInput.hasNextBoolean();
	if (answer)
	{
		System.out.println ("What is the balance on your card?");
		balance = userInput.nextDouble();
		if (balance > 1000)
		{
			System.out.println("Please pay off for your card");
		}
		else
		{
			System.out.println("Spend as much as you can");
		}
	}
	else
	{
		System.out.println ("Would you like a credit card?");
	}
}

}

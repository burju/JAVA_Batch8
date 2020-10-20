package com.syntax.class08;
import java.util.Scanner;
/*
 * Write a program to ask a user to enter item they want to buy and the price of that item.
 *  Every time user enters money accumulate the amount and tell the user how much is left to pay off. 
 *  If user give more money program should return a change. 
 * Whenever a user done with payments program should say “Thank you for shopping!”
 */
public class Task4 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	String response="";
	double total=0.0;
	do {
	System.out.println("please enter the name and the price of the item you want to buy. ");
		String itemName=input.next();
	double itemPrice=input.nextInt();
	total+=itemPrice;
	System.out.println("the total is " +  total + " Do you want to continue shopping y/n");
	response=input.next();
	} 	while (response.equalsIgnoreCase("y"));
	double cash=0;
	double change=0;
	do{
		System.out.println("Please enter amount of cash you will make the payment with");
		cash= input.nextDouble();
		change= cash-total;
		if( change>0) {
	System.out.println("the change is $" + change);
	}
	else if ( change<0) {
		System.out.println("not enough cash please insert more dollars");
	}
	}
	while ( change<0);
	System.out.println("Thank you for shopping with us, see you soon!");
}
}

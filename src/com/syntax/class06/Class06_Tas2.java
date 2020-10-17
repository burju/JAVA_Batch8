package com.syntax.class06;

import java.util.Scanner;

/* 
 * Allow user to enter grade and then provide explanation:
 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> 
 *  Not Acceptable. At the end your program should print which grade was entered by a user with explanation.
 */
public class Class06_Tas2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = input.next();
		grade.toLowerCase();
		String explanation = "";

		switch (grade) {
		case "a":
			explanation = "Excellent";
			break;
		case "b":
			explanation = "Good";
			break;
		case "c":
			explanation = "Average";
			break;
		case "d":
			explanation = "Bad";
			break;
		default:
			explanation = "not a valid grade";
			break;

		}
		System.out.println("Your grade " + grade.toUpperCase() + " is " + explanation);

	}
}

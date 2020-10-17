package com.syntax.class03;

import java.util.Scanner;

/*
 * Write a program to ask user to enter numbers of worked years and annual salary.
 *  If user worked for more or equals to 5 years than user is eligible for the bonus, 
 *  otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, 
 *  otherwise bonus=3000.
 */
public class Class5_Task {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Please enter the number of years worked and your annual salary:");
		int years = input.nextInt();
		double salary = input.nextDouble();

		if (years >= 5) {
			System.out.println("You are eligible for the bonus!");
			if (salary > 50000) {
				System.out.println("Your bonus is $5000");
			} else {
				System.out.println("Your bonus is $3000");
			}

		} else {
			System.out.println("You are not eligible for the bonus!");
		}
	}
}

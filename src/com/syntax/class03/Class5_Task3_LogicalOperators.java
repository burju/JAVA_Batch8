package com.syntax.class03;

import java.util.Scanner;


public class Class5_Task3_LogicalOperators {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Please enter the day you would like to print: ( 1-7)");

		int answer = input.nextInt();

		if (answer >= 1 && answer <= 5) {
			System.out.println("It is a weekday");
		} else if (answer == 6 || answer == 7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid entry");
		}
	}

}

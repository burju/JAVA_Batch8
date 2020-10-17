package com.syntax.class03;

import java.util.Scanner;

public class Class5_Task5_LogicalOperators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the month you were born in numbers (ex: 1 for January, 2 for February etc)");
		int month = input.nextInt();
		String season = "";

		if (month >= 1 && month <= 3) {
			season = "Winter";
		} else if (month >= 4 && month <= 6) {
			season = "Spring";
		} else if (month >= 7 && month <= 9) {
			season = "Summer";
		} else if (month >= 10 && month <= 12) {
			season = "Fall";
		} else {
			System.out.println("Invalid entry");
		}
		System.out.println("You were born in " + season);

	}
}

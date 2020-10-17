package com.syntax.class03;
import java.util.Scanner;
public class Class5_Task4_logicalOperators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quiz, midterm, final scores");
		System.out.println("Quiz score:");
		int quiz = input.nextInt();
		System.out.println("Midterm Score:");
		int midterm = input.nextInt();
		System.out.println("Final Score");
		int finalScore = input.nextInt();
		double average = (quiz + midterm + finalScore) / 3;
		char grade = 'A';

		if (average >= 90) {
			grade = 'A';
		} else if (average < 90 && average >= 70) {
			grade = 'B';
		} else if (average < 70 && average >= 50) {
			grade = 'C';
		} else if (average < 50) {
			grade = 'F';
		} else {
			System.out.println("Invalid entry");
		}
		System.out.println("Based on your scores your grade is: " + grade);
	}

}

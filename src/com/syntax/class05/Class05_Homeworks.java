package com.syntax.class05;

import java.util.Scanner;

/*
 * Write a program to find largest of three double values using if-else..if and logical operators provided by a user (numbers must be distinct)



 * You are working in sales and have to calculate commission for the employees;

You need to ask user a sales amount and based on the amount you need to define their commission

if user sold products for more than $10 but less than 100 --> commission is 10%

if sales is more than 100 but less then 200 --> commission is 20%

if sales is more than 200 but less then 500 --> commission is 30%

if sales is more than 500 --> commission is 50%

You program should print How much in commission user will get
 */
public class Class05_Homeworks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enther the sales amount: ");
		double sales = input.nextDouble();
		double commission = 0;
		if (sales > 10 && sales < 100) {
			commission = sales * 0.2;
		} else if (sales > 100 && sales < 200) {
			commission = sales * 0.2;
		} else if (sales > 200 && sales < 500) {
			commission = sales * 0.3;
		} else if (sales > 500) {
			commission = sales * 0.5;
		}

		System.out.println("Your commission is: " + commission);
	}
}

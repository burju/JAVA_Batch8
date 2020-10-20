package com.syntax.class08;

import java.util.Scanner;

public class Task3_4 {
	/*
	 



	 */
public static void main(String[] args) {
	//* Write a program that reads a range of integers (start and end point), 
	//provided by a user and then from that range prints the sum of the even and odd integers.
	Scanner input=new Scanner(System.in);
	System.out.println("Pleae enter the range of integers");
	int begin=input.nextInt();
	int end= input.nextInt();
	int sumOdd=0;
	int sumEven=0;
	for (int i = begin; i <=end; i++) {
		if(i%2==0) {
			sumEven+=i;}
		else if(i%2==1) {
			sumOdd+=i;}
		}
		System.out.println("The sum of odd numbers within the range is: " + sumOdd +"\nand sum of even numbers within the range is: " + sumEven);
	}
}


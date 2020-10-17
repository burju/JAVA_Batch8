package com.syntax.class05;

import java.util.Scanner;

/*
 * Write a program to find largest number among three numbers using nested if provided by a user 
 * (numbers must be distinct)

 */
public class Class05_Homework2 {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Please enter 3 numbers");
	double x=input.nextDouble();
	double y=input.nextDouble();
	double z=input.nextDouble();
	double biggest=0;
	
	if(x>y&& x>z) {
	       biggest=x;	
	}
	else if(y>z) {
		biggest=y;
	}
	else {
		biggest=z;
	}
	System.out.println("The largest number is:" + biggest);
}
}

package com.syntax.class08;

import java.util.Scanner;

public class ClassCodes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("please pay for the water (exactly $5) "); int payment=
		 * input.nextInt(); int price = 5; while( payment != price) { if (
		 * payment<price) { System.out.println("Please give " + (price-payment) +
		 * " dollars more"); payment= input.nextInt(); } else if( payment>price) {
		 * System.out.println("Please use exact change. please give exactly" + (price) +
		 * " dollars"); payment= input.nextInt(); } } if (payment==price) {
		 * System.out.println("please take your water "); } Print numbers from 1 to 100
		 * in 1 line with space
		 * 
		 * 
		 * Print numbers from 100 to 1
		 * 
		 * 
		 * Print even numbers from 20 to 1 (2 ways)
		 * 
		 * 
		 * Print odd numbers between 20 and 50 (2 ways)
		 */

		// ----------------------------------------------------------------------------------------------
/*
// Print numbers from 1 to 100 in 1 line with space
		System.out.println("Print numbers from 1 to 100 in 1 line with space");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
//Print numbers from 100 to 1		
		System.out.println("Print numbers from 100 to 1	");
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
//Print even numbers from 20 to 1 (2 ways)
		// 1st way:
		System.out.println("Print even numbers from 20 to 1 (1st way)");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 2nd way
		System.out.println("Print even numbers from 20 to 1 (2nd way)");
		for (int i = 2; i <= 20; i=i+2) {
				System.out.print(i + " ");
		}
		System.out.println();
      // Print odd numbers between 20 and 50 (2 ways)
		System.out.println("Print odd numbers from 20 to 50 (1st way)");
		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		// 2nd way
		System.out.println("Print odd numbers from 20 to 50 (2nd way)");
		for (int i = 21; i <= 50; i=i+2) {
				System.out.print(i + " ");
		}
		System.out.println();
		
	*/	
		// claculate eve& odd 1-50
		/*int sumEven=0;
		int sumOdd=0;
		for (int i = 1; i <= 50; i++) {
			
			if( i%2==0) {
				sumEven+=i;
			}
			else if(i%2==1) {
				sumOdd+=i;
			}
			
		}
		System.out.println("Sum of Even numbers:" + sumEven +  "\n and sum of odd numbers: "+  sumOdd);
		*
		int num=3;
		//MULTIPICATION table
		for(int i=1; i<=10; i++) {
			System.out.println(num +  "x" + i+ "=" + (i*1) );
		}
		
		//I want to print numbers from 1to 5 excecpt 3;
		for (int i = 1; i <=10 ; i++) {
			if( i==3 || i == 7) { continue;}
			System.out.println(i + " ");
		*/
		
		//nested loop 1
	
	}
}

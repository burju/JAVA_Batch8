package com.syntax.class10;

import java.util.Scanner;

public class ArrayWithScanner {
	public static void main(String[] args) {
		/*
		 * Scanner input= new Scanner(System.in);
		 * System.out.println("how many names do you want to store"); int num=
		 * input.nextInt();
		 * 
		 * String[] names= new String[num];
		 * 
		 * /*for (int i = 0; i < num; i++) { System.out.println("please enter name:");
		 * names[i]= input.next(); System.out.println(names[i]); }
		 * 
		 */

		String[] cars = { " Volkswagen", " Opel", " BMW", " Hyundai", " Toyota", " Tesla" };

		/*for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");}
		*
			for (String car : cars) // for every cars string element store it inside String Car{
				System.out.println(car);
		}
	
		
		int[] numbers= {10, 10, 90, 600, 89};
		for (int i : numbers) {
			System.out.println(i);
		}
	*/
		boolean [] arrayOfBoolean= { true, false, true, false, false};
		for (boolean b : arrayOfBoolean) {
			System.out.println(b);
		}
}}
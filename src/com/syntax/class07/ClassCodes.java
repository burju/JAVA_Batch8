package com.syntax.class07;

import java.util.Scanner;



public class ClassCodes {
	public static void main(String[] args) {
	
			
			boolean workday= true;
			int dayNumber= 1;
		
			
			while (workday) {
				System.out.println("I need a day off");
				dayNumber++;
				if (dayNumber >= 6) {
					workday = false;
				}

				while (!workday && dayNumber < 8) {
					System.out.println("I dont need a day off anymore");
					dayNumber++;

				}
			}
				
			
			System.out.println();
			
			System.out.println("DO WHILE & WHILE LOOPS:");
			System.out.println("---------------------------");
			System.out.println("While loop:");
			int b=10;
			while( b<15) {
				System.out.println("Hello");
				b++;
			}
			System.out.println("Do while");
			int c=10;
			do {
				System.out.println("hi");
				c++;
			}
			while(c<15);
	// do while executes at least once and checks for the condition later
	
				Scanner input= new Scanner(System.in);
				int counter=0;
				String name="";
				while ( counter <5) {
					System.out.println("Please enter your name:");
					name=input.next();
				    System.out.println("Hello " + name);
				    counter++;
				    }
				
				// 
				System.out.println("please enter a number bet 1-100");
				int number= input.nextInt();
				int luckyNumber=7;
				while( number!=luckyNumber) {
					System.out.println("Please enter anothe num bet 1-100");
					number= input.nextInt();
					
				}
				System.out.println(" congrats! you founf the lucky number!");
}
}

package com.syntax.class03;

import java.util.Scanner;

public class String_Equals_Komutu_Kullanmalisin {
	
	public static void main(String[] args) {
		/* NOte: == tests for reference equality (whether they are the same object= 
		 .equals() tests for value equality (whether they are logically "equal").*/
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" Welcome to BoA home page. please enter your name & password");
		String name= input.next();
		String pass= input.next();
		
		if(name.equals("Burcu") && pass.equals("burcu123")) {
			System.out.println("Welcome to your BoA account. Please enter the amount you want to transfer: ");
			double amount=input.nextDouble();
			}
			
			else if (name.equals("Burcu") && pass.equals("burcu123")==false) {
				System.out.println("Wrong password, please enter your password");
			}
			else if ( name!="Burcu" && pass.equals("burcu123")) {
				System.out.println("Wrong username, please enter your username");
		      }
		
			else {
				System.out.println("Invalid credentials, please try again");
			  }
	}

}
package com.ExtraExercises.com;

import java.util.Scanner;

/*
 * IP address is a string in the form "A.B.C.D",
 *  where the value of A, B, C, and D may range from 0 to 255. 
 *  Leading zeros are allowed. 
 *  The length of A, B, C, or D can't be greater than 3.
 */
public class MyRegEx {

	public static void main(String[] args) {
		boolean valid= true;
		Scanner input= new Scanner(System.in);
		int stringLength=0;
		//THE FIRST 3 DIGITS OF THE IP ADDRESS:
		// A:
		System.out.println("Please enter the first 3 digits of the IP address");
		String a= input.next();
		stringLength= a.length();
		
		if(stringLength==1) {//check whether the string length is 3 or not 			
		char firstChar= a.charAt(0);
		}
		else if (stringLength==2) {
			char firstChar= a.charAt(0);
			char secondChar= a.charAt(1);
		}
		else if (stringLength==3) {
			char firstChar= a.charAt(0);
			char secondChar= a.charAt(1);
			char thirdChar= a.charAt(2);}
		else {
			valid=false;}
		
				//string length testini gecince girilenler sayi mi diye kontrol edelim.
				//check whether the input chars are number or not. through ASCII code
				if((firstChar>=48 && firstChar<=57) && (secondChar>=48 && secondChar<=57) && (thirdChar>=48 && thirdChar<=57)) {
					valid=true;
						}
				else {// if the entry does not consist of numbers:
							valid=false;
							System.out.println(valid);
						}
		
		}
		else {// if the length is not equal to 3: 
			valid=false;
			System.out.println(valid);
		}
		
		//THE SECOND 3 DIGITS OF THE IP ADDRESS:
		// B:
		System.out.println("\nPlease enter the second 3 digits of the IP address");
		String b= input.next();
		stringLength= b.length();
		
		if(stringLength<=3) {//check whether the string length is 3 or not 			
		char firstChar= b.charAt(0);
		char secondChar= b.charAt(1);
		char thirdChar= b.charAt(2);
				
				//string length testini gecince girilenler sayi mi diye kontrol edelim.
				//check whether the input chars are number or not. through ASCII code
				if(firstChar>=48 && firstChar<=57 && secondChar>=48 && secondChar<=57 && thirdChar>=48 && thirdChar<=57) {
					valid=true;
						}
				else {// if the entry does not consist of numbers:
							valid=false;
							System.out.println(valid);
						}
		
		}
		else {// if the length is not equal to 3: 
			valid=false;
			System.out.println(valid);
		}
		
		
		//THE THIRD 3 DIGITS OF THE IP ADDRESS:
		// C:
		System.out.println("\nPlease enter the third 3 digits of the IP address");
		String c= input.next();
		stringLength= c.length();
		
		if(stringLength<=3) {//check whether the string length is 3 or not 			
		char firstChar= c.charAt(0);
		char secondChar= c.charAt(1);
		char thirdChar= c.charAt(2);
				
				//string length testini gecince girilenler sayi mi diye kontrol edelim.
				//check whether the input chars are number or not. through ASCII code
				if(firstChar>=48 && firstChar<=57 && secondChar>=48 && secondChar<=57 && thirdChar>=48 && thirdChar<=57) {
					valid=true;
						}
				else {// if the entry does not consist of numbers:
							valid=false;
							System.out.println(valid);
						}
		
		}
		else {// if the length is not equal to 3: 
			valid=false;
			System.out.println("Invalid entry. Please enter a 3 digit number which can start with 0 too");
		}

		
		
		//THE LAST 3 DIGITS OF THE IP ADDRESS:
		// D:
		System.out.println("\nPlease enter the last 3 digits of the IP address");
		String d= input.next();//read the last 3 digits
		stringLength= d.length();
		
		if(stringLength==1) {//check whether the string length is smaller than3  or equal to 3 or not 			
		char firstChar= d.charAt(0);
		char secondChar= d.charAt(1);
		char thirdChar= d.charAt(2);
				
				//string length testini gecince girilenler sayi mi diye kontrol edelim.
				//check whether the input chars are number or not. through ASCII code
				if(firstChar>=48 && firstChar<=57 && secondChar>=48 && secondChar<=57 && thirdChar>=48 && thirdChar<=57) {
					valid=true;
					System.out.print(valid);
						}
				else {// if the entry does not consist of numbers:
							valid=false;
							System.out.println(valid);
						}
		
		}
		else {// if the length is not equal to 3: 
			valid=false;
			System.out.println("Invalid entry. Please enter a 3 digit number which can start with 0 too");
		}
		
	
	}

}

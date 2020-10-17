package com.syntax.class01;
/*Create a Java program and name it Variable
In your program create different type of variables to store student’s information and then print value of those variables:
name
lastName
grade
city
state
phoneNumber
b)   Change student’s city, state, phone number and grade. And print those updated values.
*/

public class Variables {
	public static void main(String[] args) {
		String name , lastName; 
		char grade;
		String city, state;
		long phoneNumber;
		
		name = "Burcu";
		lastName ="Kaya";
		grade = 'A';
		city = "Dallas";
		state= "TX";
		phoneNumber= 9997776655L;
 
		System.out.println(" " + name + " , " + lastName+ " , "+ grade+ " , "+ city+ " , "+state+ " , "+ phoneNumber);
	}

}

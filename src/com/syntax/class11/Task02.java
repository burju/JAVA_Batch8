package com.syntax.class11;


/*
 * Create a 2D array where you will store the following values: 
 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
After storing values print the following:
Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

 */
public class Task02 {
public static void main(String[] args) {
	
	String[][] x= new String[2][4];
	
	x[0][0]= "Mr";
	x[0][1]= "Mrs";
	x[0][2]= "Ms";
	x[0][3]= "Miss";

	x[1][0]= "Smith";
	x[1][1]= "Obama";
	x[1][2]= "Jackson";
	x[1][3]= "Jordan";
	
System.out.println(x[0][0] +" " + x[1][0]);
System.out.println(x[0][1] +" " + x[1][1]);
System.out.println(x[0][2] +" " + x[1][2]);
System.out.println(x[0][3] +" " + x[1][3]);
		}
}

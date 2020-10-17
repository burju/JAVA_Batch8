package com.syntax.class01;

/*Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. 
 * “The _______ of 2 numbers ___ and ___ is equal to _____”
Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ ”
Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say.
 “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __”
 * 
 */
public class MathValues {
	public static void main(String[] args) {
		double a= 0.11;
		double b = 0.22;
		double answer= a*b;
		System.out.println(" * the multiplication of numbers " + a + " and " + b + " is equal to: " + answer);
	
		answer = a+b;
		System.out.println(" * the sum of numbers " + a + " and " + b + " is equal to: " + answer);
		
		answer= a-b;
		System.out.println(" * the subtraction of numbers " + a + " and " + b + " is equal to: " + answer);
		
		answer = a/b;
		System.out.println(" * the division of numbers " + a + " and " + b + " is equal to: " + answer);		

		//Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ ”
		double c= 3.9;
		System.out.println("The square of the " + c + " is " + (c*c));
				
		//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 		
		int width = 5;
		int height = 8;
		System.out.print("The preimeter of a rectangle with width" + width + " and height" +
								height + " is equal to " + ((height+width)*2)+ " and the area is " + (height*width));
	
	}
}

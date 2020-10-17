package com.syntax.class01;

public class StringConcatenation {
	public static void main(String[] args) {
		
		String name= " Olga ";
		
		// I would like to say " My name is Olga"

		System.out.println(" My name is " + name);
		
		String lastName = " Sorrels ";
		System.out.println(name + lastName);
		
		String city= " Miami ";
		//olga lives in Miami
		System.out.println(name + " lives in " + city );
		
		char grade = 'B';
		//olga is B student.
		System.out.println(name + " is " + grade + " student ");
		
		int age = 21;
		// olga is 21 years old
		
		System.out.println(name + " is "+ age + " years old ");
		System.out.println(age + grade + name);
		
	}

}

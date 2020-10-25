package com.syntax.class10;
/*
 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
hen print a grade B (use 2 different ways of creating an array).

Create an array of names and store all names of your group. 
Then print your name from that array. (use 2 different ways of creating an array).

Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.


 */
public class Task1 {
public static void main(String[] args) {
	System.out.println("--------------------TASK1-----------------------");
	char[] grades= { 'A', 'B', 'C', 'D','E', 'F'};
	char [] grades2= new char[5];
	grades2[0]= 'A';
	grades2[1]= 'B';
	System.out.println(grades[1]);
	System.out.println(grades2[1]);
	for (int i = 0; i < grades2.length; i++) {
		System.out.println(i);
	}
	
	System.out.println("--------------------TASK2-----------------------");
	
	String[] names= { "Ali", "Burcu", "Ceylan", "Derya"};
	String [] names2= new String[5];
	names[0]= "Ali";
	names2[1]= "Burcu";
	System.out.println(names[1]);
	System.out.println(names2[1]);
	
	System.out.println("--------------------TASK3-----------------------");
	String[] sentence= { "Saturday", "is", "Java", "coding", "day"};

	
	System.out.println(sentence[0]+ " " + sentence[1]+" "+ sentence[2]+" "+ sentence[3]+" "+ sentence[4] );
	
}
}

package com.syntax.class03;

public class DoubleComparison {
	
	public static void main(String[] args) {
		double a= 2;
		double b= 4;
		
		if ( a>b) {
			System.out.println(" Double value " + a + " is larger than " + b );
		}
		else {
			System.out.println(" Double value " + b + " is larger than " + a );
		}
System.out.println(" -----------------------------------------------------------------------------------");

// TEMPERATURE CHECK: 
int temp= 39;
 if ( temp< 32) { 
	 System.out.println(" Water'll freeze at temperature: " + temp);
 }
 else {
	 System.out.println(" Water'll NOT freeze at temperature: " + temp);
 }
 
 boolean sleepy= false;
 if (sleepy) {
	 System.out.println(" I'll take a nap");
 }
 else {
	 System.out.println(" I'll study JAVA");
 }
	
 
 
 
}

}


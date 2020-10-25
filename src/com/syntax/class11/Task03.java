package com.syntax.class11;
/*
 * Create an array of cars : american, german, korean, italian.
 *  And print all values from a 2D array
 */
public class Task03 {
public static void main(String[] args) {
	
	String[][] carMake= {
			{"ford", "gmc", "tesla"},
			{"vw" , "audi", "bmw"},
			{"kia", "hyundai", "xyz"},
			{"ferrari", "maserati", "lamborgini"}
	};
		
	for (int i = 0; i < carMake.length; i++) {
		for (int j = 0; j < carMake[i].length; j++) {
			System.out.print(carMake[i][j]+ " ");
		}
		System.out.println();
	}
			
	}
	
	
}

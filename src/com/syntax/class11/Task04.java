package com.syntax.class11;

public class Task04 {
	public static void main(String[] args) {
		
		// create an 2d array of food 
		
		// american, italian, asian, afghan, indian
		
		String [][] food= {
				
				{"steak", "hot dog", "burger"},
				{"pizza", "pasta", "canoli"},
				{"sushi", "ramen", " fried rice", "dumplings"},
				{"kebab", "manto"},
				{"biryani", "masala", "curry", "chicken tikka masala"}
		};
		
		
		for(String[] dishes :food) {
			for(String dish:dishes) {
				
				System.out.print(dish + ", ");
			}
			System.out.println();
		}

	for (int i = 0; i < food.length; i++) {

		for (int j = 0; j < food[i].length; j++) {
			System.out.print(food[i][j]);
		}
	}
	}

}

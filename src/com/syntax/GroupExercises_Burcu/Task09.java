package com.syntax.GroupExercises_Burcu;


/*
 * Create an array of countries: 
 * north america countries, south america countries, europe countries, asian countries, african 
 * countries. 
 * Then print all values from that array using 2 different loops
 *  and calculate how many total countries been stored.
 */
public class Task09 {
	
public static void main(String[] args) {
	
	String[][] countries= {
			{"USA", "Canada", "Mexico"},
			{"Brazil", "Bolivia", "Argentina"},
			{"Italy", "France", "Poland"},
			{"Turkey", "Russia", " China"},
			{"Nigeria", "South African Republic", "Congo"}};
	
	int count=0;
	System.out.println("Enhanced FOR=================================================================");
	for(String[] country:countries) {
		for(String names:country) {
			
			System.out.print(names+ ", ");
			count++;
		}}
	System.out.println("\nThere are " + count + " countries listed");
	
	System.out.println("Regular FOR================================================================");
	count=0;
	
	for (int i = 0; i < countries.length; i++) {
		for (int j = 0; j < countries[i].length; j++) {
		count++;
		System.out.print(countries[i][j]+ ", ");
		}
	}
	System.out.println("\nThere are " + count + " countries listed");
}

}

package com.syntax.class10;
/*
 * 

Create an array of countries. While retrieving all values from an array print capital for each country.
 (use 2 different loops).

 */
public class HW3 {
public static void main(String[] args) {
	
	String[] countries= { "USA", "Italy", "France", "Greece", "Turkey", "Bulgaria"};
	
	String capital="";
	
	
	switch (countries[i]) { 
	case "USA" : capital= "Washington, D.C";
	break;
	case "Italy" : capital= "Rome";
	break;
	case "France" : capital = "Paris";
	break;
	case "Greece" : capital = "Athens";
	break;
	case "Turkey" : capital ="Ankara";
	break;
	case "Bulgaria" : capital = "Sofia";
	break;
	
	System.out.print(countries[i]+ " ");
	}

	System.out.println("\n---------------PRINTING WITH FOR --------------------------------------------------");
	for (int i = 0; i < countries.length; i++) {
		System.out.print(countries[i]+ " ");
	}
	System.out.println("\n---------------PRINTING WITH FOREACH -----------------------------------------------");
	
	for(String printCapital: countries) {
		System.out.print(printCapital+ " ");
	}


}}

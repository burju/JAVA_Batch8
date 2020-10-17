package com.syntax.class06;

import java.util.Scanner;

public class Class06_Task1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("is everything on sale? true/false");
		boolean sale = input.nextBoolean();
		String answer= input.next();
		if(answer.equals)
		double discount = 0;
		if (sale) {
			System.out.println(" how much is the item? ");
			double price = input.nextDouble();
			if (price > 10 && price < 50) {
				discount = .10;
			} else if (price >= 50 && price < 100) {
				discount = .20;
			} else if (price >= 100 && price < 500) {
				discount = .40;
			} else if (price >= 500) {
				discount = .50;
			}
			System.out.println("The final price with the discount is " + (price - (price * discount)));
		}

		else {
			System.out.println("No shopping");
			
			import java.util.Scanner; 
			class Main {
			  public static void main (String[] args){
			    Scanner input=new Scanner(System.in);
			    System.out.println("Do you need a loan? (Yes/No)");
			    String answer=input.next();
			    if(answer.equalsIgnoreCase("yes")){
			      System.out.println("What is your credit score?");
			      int score=input.nextInt();
			      String bankResponse="";
			      if(score<600){
			         bankResponse="Not Eligible";
			      } 
			      else if(score=>600 && score=<700){
			        bankResponse="Maybe eligible";
			      }
			      else if(score>701 && score=<800){
			        bankResponse="Eligible";
			      }
			      else if (score>800){
			        bankResponse="Definitely Eligible";
			      }
			      else {
			        bankResponse= "Not a valid score";
			      }
			    }
			    }
			  }
		}

	}
}

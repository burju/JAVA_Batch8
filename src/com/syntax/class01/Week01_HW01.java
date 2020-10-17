package com.syntax.class01;

import java.util.Scanner;

public class Week01_HW01 {
	  public static void main(String[] args){
		    
	  	  Scanner input=new Scanner(System.in);
		    System.out.println("enter the age of the Child");
		    int age=input.nextInt();
		    String ability="";
		    Scanner.close();
		    
		    
		    if (age <1 || age >4){
		      System.out.println("I don't know how old are you");
		    }
		    else {
		    switch (age){
		      case 1:
		        ability= "Crawl";
		        break;
		        case 2:
		        ability= "Talk";
		        break;
		        case 3:
		        ability= "Dance";
		        break;
		        case 4:
		        ability= "get Trouble";
		        break;
		        
		    }
		    System.out.println("You can " + ability);
		    }

	  }
	}
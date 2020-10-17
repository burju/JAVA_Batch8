package com.syntax.class07;

import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class ClassCodes {
	public static void main(String[] args) {
	
			
			boolean workday= true;
			int dayNumber= 1;
		
			
			while ( workday){
				System.out.println("I need a day off");
				dayNumber++;
				if(dayNumber>=6) {
					workday=false;}
				
					while( !workday && dayNumber<8) {
					System.out.println("I dont need a day off anymore");
					dayNumber++;
					
				}
			}
				
			}
	}


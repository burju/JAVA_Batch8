package com.syntax.class09;

public class ClassCodes {
	public static void main(String[] args) {
		/*
for (int i = 10; i <= 14; i++) {
	
	
	for (int j = 1; j <=4; j++) {
		System.out.print ( i+" ||"+ j +"     ");
		
		
	}
	
}
	
// saatler:
/*
for (int i = 0; i < 24; i++) {
	for (int j = 0; j <60; j++) {
		String hour="";
		String minutes="";
		if( i<10) {
		 hour= "0"+i;}
		else { hour= ""+i;
		}
		
		if( j <10) 
		 minutes= "0"+j;
		
		else{
			  minutes= ""+j;
		}
		System.out.println(""+ hour+":"+ minutes);
	}
}
*/
String miles="";

for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		for (int j2 = 0; j2 < 10; j2++) {
			for (int k = 0; k < 10; k++) {
				for (int k2 = 0; k2 < 10; k2++) {
					miles= ""+ i +" "+ j +" "+j2 +" "+ k +" "+k2;
					System.out.println(miles);
				}
				
			}
		}
		
	}
}
	}

}

package com.syntax.class03;

public class Course_notes {
	public static void main(String[] args) {
	/*	
		1. Declare variable and increase by 100 using shorthand operator
		2. Declare variable and decrease by 67 using shorthand operator
		3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator 
		4. Declare variable cakePiece=25 and divide cakePiece between 7 people .
		 Using shorthand operator found out how many pieces of cake left after 
		 it was distributed equally among 7 people
		*/
		int x=100;
		x+=100;
		int y=100;
		y-=67;
		int cakePiece=11;
		cakePiece/=4;
		int cakePiece2=25;
		cakePiece2%=7;
		
		String a= "ali";
		String b= "veli";
		
		System.out.println(" x: " + x+", y: "+ y+ ", cakePiece divided by 4: "+ cakePiece+
				", cakePiece2 mod7: "+ cakePiece2);
		
		boolean result = x>y;
		System.out.println(x>y);
		
		if (x>y) {
			System.out.println("x is bigger than y");
		}
		else {
			System.out.println("y is bigger than x");
		}
		
	}

}

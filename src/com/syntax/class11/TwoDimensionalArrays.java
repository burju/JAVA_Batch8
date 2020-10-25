package com.syntax.class11;

import java.lang.reflect.Array;

public class TwoDimensionalArrays {
	public static void main(String[] args) {
	char[][] $array= new char[3][4];
	
	$array[0][0]='A';
	$array[0][1]='B';
	$array[0][2]='C';
	$array[0][3]='D';
	
	$array[1][0]='W';
	$array[1][1]='X';
	$array[1][2]='Y';
	$array[1][3]='Z';
	
	
	$array[2][0]='Q';
	$array[2][1]='W';
	$array[2][2]='B';
	$array[2][3]='R';
	
	System.out.println($array.length); // gives me the number of x s
	System.out.println($array[0].length);// gives me the number of y on each x s
	
	for (int i = 0; i < $array.length; i++) {
		for (int j = 0; j < $array[i].length; j++) {
			System.out.print($array[i][j]);
		}
		System.out.println();
	}
	System.out.println("=================");
	for (char[] cs : $array) {
			System.out.println(cs);
		}
		
	
	}

}

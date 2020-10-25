package com.syntax.class10;

public class Arrays {
	public static void main(String[] args) {
	int [] score= {90, 25, 10, 17, 22};
	
	double total=0;
	
	for (int i = 0; i <score.length; i++) {
		total+= score[i];
	}
	
	double average= total/score.length;
	
	System.out.println(average);
	
	String[] liquid= {"water", "juice", "coffee", "tea"};
	
	
	
	
	}}

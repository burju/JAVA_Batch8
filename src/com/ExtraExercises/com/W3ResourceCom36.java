package com.ExtraExercises.com;
import java.util.Scanner;
/* 
 * 36. Write a Java program to compute the distance between two points on the surface of earth. Go to the editor
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output
The distance between those points is: 1480.0848451069087 km  */
public class W3ResourceCom36 {
	public static void main(String[] args) {
		double radius= 6371.01 ;
		Scanner input= new Scanner(System.in);
		System.out.println(" enter the coordinates of X and Y to compute the distance between 2 points");
		//take value
		double x1= input.nextDouble();
		double y1= input.nextDouble();
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		double var1= Math.acos(Math.sin(x1)*Math.sin(x2));
		double d= radius * + var1+Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - 2));
		System.out.println(" The distance between those points is: " + d);
	}
}

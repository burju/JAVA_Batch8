package com.syntax.class01;

public class VariableValues {
public static void main(String[] args) {
	/* introduce vars using primitive data types:
	*numeric:
	*/
	byte a= 127;
	short b= 10_000; 
	int c= 10_000_000;
	long d= 10_000_000_000L;
	float e= 2.99f;
	double f= 19.99;
	// non-numeric:
	char myNameStartsWith= 'B';
	boolean amIaWoman= true;
	
	//assign new values to already declared variables:
	a=126;
	b=9_000;
	c= 10_000_001;
	d= 10_000_000_001L;
	e= 2.98f;
	f= 18.99;	
	myNameStartsWith= 'b';
	amIaWoman= false;
	
	System.out.println(a);	System.out.println(b);	System.out.println(c); 	System.out.println(d);	System.out.println(e);	
	System.out.println(f);	System.out.println(myNameStartsWith);	System.out.println(amIaWoman);	

}
}

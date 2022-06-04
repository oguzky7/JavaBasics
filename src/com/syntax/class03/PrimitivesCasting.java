package com.syntax.class03;

public class PrimitivesCasting {

		//ctrl+space --> auto complete
		//main ctrl+space
	
	public static void main(String[] args) {
		
		int i=100;
		double d=100;
		
		System.out.println(i);	//100
		System.out.println(d);	//100.0
		
		long l=100987897987986l;
		
		//byte b=130;
		
		//Type mismatch: cannot convert from double to int
		//int x=99.99 error: cannot convert from double to int
		
		int x=(int)99.99;	//narrowing
		System.out.println(x);
		
		//If you write a value bigger then 127 in a byte it is
		//gonna give you remainder of 256
		//cause byte has a 256 number capacity
		byte b=(byte)130;
		System.out.println(b);

		//Type mismatch: cannot convert from double to float
		float f=10.99f;
		
		double dd=9.99;
		
		double price=100;
		
		
	}

}

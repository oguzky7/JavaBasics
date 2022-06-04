package com.syntax.reviewClass;

import java.math.BigInteger;

public class Variables {
	public static void main(String[] args) {
	
		
		String a="10";
		String b="20";
		//System.out.println(a*b);
		//boxes to store numbers without decimal places
		byte smallestBox=127; //-128 to 127
		short slightlyLargeBox=16665; //-32768 to 32767
		int famousBox=2145555; //Most of the time we are gonna use this box to store whole numbers
		long notThatFamousBox=4545454545454l; //
		BigInteger i=new BigInteger("11111111111155555555555555555564521654164165161");
		float f=12.555555555555252777f;
		double d=12.555555252525257777;
		System.out.println(f);
		System.out.println(d);
		
		float f1=10.0f/3.0f;
		double d1=10.0/3.0;
		System.out.println(f1);
		System.out.println(d1);
		
		//always for whole numbers use int dataType and for decimal numbers use double dataType
		char letter='a';
		System.out.println(letter);
		String name="Kaan";
		String address="house #5, Flat #3, street121";
		
		//char emoji='\uD83D\uDE00';
		//System.out.println(\uD83D\uDE00);
		
		
		
		
		
		
		
		
		
		
	}
}

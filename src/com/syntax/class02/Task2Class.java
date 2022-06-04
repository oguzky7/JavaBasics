package com.syntax.class02;

public class Task2Class {

	public static void main(String[] args) {
		 /*
		 * Create a Java program and name it Variables
In your program create different type of variables to store student’s information
(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
My name is ___ and my last name is ____
I am A/B student
I live in city__ and state____
And my phone number is …..
b) Change student’s city, state, phone number and grade. And print those updated values:
Example:
My name is __ and I moved to new city__ and new state__. My new phone number is ___
		 * Grade sting olmasin
		 */
		
		//Part a)
		String name, lastName, city, state;
		char grade='A';
		
		lastName="YILDIRIM";
		name= "Kaan";
		city= "Alexandria";
		state= "VA";
		long phoneNumber= 8645156780L;
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in "+city+"/"+state);
		System.out.println("My phone number is "+phoneNumber);
		System.out.println(" ");
		System.out.println(" ");
		//Part b)
		
		grade= 'B';
		city= "New Carrolton";
		state= "MD";
		phoneNumber= 8644926780L;
		System.out.println("My name is "+name+" and I moved to "+city+"/"+state+" . My new phone number is "+phoneNumber );
	}
}

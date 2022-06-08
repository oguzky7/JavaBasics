package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {

//Proper way of creating an object from a class		
		String name = new String("Oleg");

		
//This is the same but like a shortcut		
		String name2 = "Oleg";
//All the classes in java can be treated as data types
//If a class is present inside the same package or if a class bellongs to java.lan package
		name.length();
		System.out.println(name.length());
		
		name2= " Z amerr";
		System.out.println(name2.length());
		
		String name3="Oleg";
		System.out.println(name3.length());
		
		String captain="NAVEED";
		System.out.println(captain.toLowerCase());
		captain="I love Java";
		captain=captain.toUpperCase();
		System.out.println(captain);
		
		
		

	}
}

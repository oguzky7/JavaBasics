package com.syntax.class09;

public class AnotherWay {
	public static void main(String[] args) {

		String[] fruits= {"mango", "apple", "kiwi", "pear","watermelon","melon"};
		
		System.out.println(fruits[2]);
		
		fruits[3]="peach";
		
		System.out.println(fruits[3]);
		
		System.out.println("My favorite fruit is "+fruits[0]);
		
		//I want to find a size of an array 
		
		int size = fruits.length;
		System.out.println(size);
		
		
	}
}

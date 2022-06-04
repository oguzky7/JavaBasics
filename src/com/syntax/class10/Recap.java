package com.syntax.class10;

public class Recap {
	public static void main(String[] args) {

		String[] disney= {"Shrek","Elsa","Goofy","Mulan"};
		
		System.out.println(disney[1]);
		
		System.out.println("All elements using regular for loop -----");
				
		for (int i=0; i<disney.length; i++) {
			System.out.print(disney[i]+" ");
		}
		System.out.println("All elements using regular for loop -----");
		
		for (String character:disney) {
			System.out.print(character+" ");
		}
		
		
	}
}

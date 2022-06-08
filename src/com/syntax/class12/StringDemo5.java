package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str="Sameer is funny Sameer is gulbadan and he is sheer badan";
		
		System.out.println(str.charAt((2)));
		
		int sum=0;
		
		for(int i=0; i<str.length(); i++ ) {
			System.out.print(str.charAt((i)));
			sum++;
			
			
		}
		System.out.println(" ");
		System.out.println(sum);
		
	}
}

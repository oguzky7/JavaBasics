package com.syntax.class12;

public class StringDemo6 {

	public static void main(String[] args) {
		
		String str="Sameer is funny Sameer is gulbadan and he is sheer badan";
		
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {

			if ('s' == str.charAt(i) || 'S' == str.charAt(i) || 'a' == str.charAt(i) || 'A' == str.charAt(i)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}

package com.syntax.class04;

import java.util.Scanner;

public class UserInput_Scanner {

	public static void main(String[] args) {
		// Creating a scanner
		Scanner input = new Scanner(System.in);

		// send instruction to the console
		System.out.println("Please enter your name");

		// we need to grab the values from console
		String name = input.next(); // after you type the value -->hit enter

		//System.out.println(name);

		// let's send instruction
		System.out.println(name + " please enter your age");

		// need to capture and store age
		int age = input.nextInt();
		
		System.out.println(name+" is "+age+" years old");
		

	}

}

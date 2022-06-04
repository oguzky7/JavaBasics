package com.syntax.homeWorks;

import java.util.Scanner;

public class HomeWork4_05_08_2022 {

	public static void main(String[] args) {
		/*
		 * Create a java program in which using Scanner you are going to capture user’s
		 * first name, last name and state where he/she lives.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Hello, Please enter your first name.");

		String firstName = input.next();

		System.out.println("Thank you " + firstName + ", now please enter your last name.");

		String lastName = input.next();

		System.out.println("Perfect! Now please enter the state you are currently living.");

		String state = input.next();

		System.out.println(firstName + " " + lastName + " lives in " + state);

	}
	// oguzky7
}

package com.syntax.class05;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		/*
		 * Ask user to enter a number and then define if number is small, medium or large 
		 * Small number is value between 1 and 10 
		 * Medium number is value between 11 and 100 
		 * Large number is value between 101 and 1000
		 */
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter avalue");
		double value = input.nextDouble();

		if (value >= 1 && value <= 10) {
			System.out.println("Small number");
		} else if (value >= 11 && value <= 100) {
			System.out.println("Medium number");
		} else if (value >= 101 && value <= 1000) {
			System.out.println("Large number");

		}
		// oguzky7	
	}
}
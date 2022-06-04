package com.syntax.homeWorks;

import java.util.Scanner;

public class HomeWork5_05_08_2022 {

	public static void main(String[] args) {
		/*
		 * Create a java program in which using Scanner you are going to capture 2
		 * numbers. And once you capture 2 numbers, please check which one is the
		 * largest.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter 2 numbers to learn which one is larger.");
		System.out.println("");
		System.out.println("Enter the first number:");
		double num1 = input.nextDouble();
		System.out.println("Enter the second number");
		double num2 = input.nextDouble();

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is larger than " + num1);
		} else {
			System.out.println("Numbers are equal");
		}
	}
	// oguzky7
}

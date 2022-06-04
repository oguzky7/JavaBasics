package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Class04, Task3 Write a program to store a value whether user has diploma or
		 * not. If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 output should say
		 * “You are eligible for scholarship”, otherwise “You should have studied
		 * harder” .
		 */System.out.println("");
		boolean diploma = false;
		double gpa = 3.5;

		if (diploma) {
			System.out.println("Congratulations");
			System.out.println("");
			System.out.println("What is your gpa?");

			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else if (gpa < 3.5) {
				System.out.println("You should've studied harder");
			}
		} else {
			System.out.println("You should get a degree");
		}
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("");
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 50000 than user will take a loan,
		 * otherwise user will pay cash.
		 */
		double rate = 4.5;
		int price = 30000;

		if (rate > 4.5) {
			System.out.println("I'm not buying a house with these rates!");
		} else if (rate <= 4.5) {
			System.out.println("I may buy a house with these rates. Let me check the prices.");
		}
			if (price > 50000) {
			System.out.println("I need to take loan in order to buy this house");
		} 	else if (price <= 50000) {
			System.out.println("I can buy this house by paying cash");
		}
	} // oguzky7

}

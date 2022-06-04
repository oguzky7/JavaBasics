package com.syntax.class07;

import java.util.Scanner;

public class CalculatorHomeWorkRecap {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int num1 = input.nextInt();

		System.out.println("Please enter 2nd number");
		int num2 = input.nextInt();

		System.out.println("Please enter operator");
		String operator = input.next();
		double outcome = 0.0;

		if (operator.equalsIgnoreCase("+")) {
			outcome = num1 + num2;

		} else if (operator.equalsIgnoreCase("-")) {
			outcome = num1 - num2;

		} else if (operator.equalsIgnoreCase("*")) {
			outcome = num1 * num2;

		} else if (operator.equalsIgnoreCase("/")) {
			outcome = num1 / num2;
		} else {
			System.out.println("Invalid operator");
		}
		System.out.println("The result of outcome " + outcome);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

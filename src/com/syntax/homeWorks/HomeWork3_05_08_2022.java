package com.syntax.homeWorks;

public class HomeWork3_05_08_2022 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */

		double num1, num2, num3;
		num1 = 9;
		num2 = 9;
		num3 = 15;

		if (num1 > num2 & num1 > num3) {
			System.out.println(num1 + " is the largest number.");
		} else if (num1 == num2 & num1 > num3) {
			System.out.println("Numbers " + num1 + " and " + num2 + " are equal and largest");
		} else if (num1 == num3 & num1 > num2) {
			System.out.println("Numbers " + num1 + " and " + num3 + " are equal and largest");
		} else if (num2 == num3 & num3 > num1) {
			System.out.println("Numbers " + num2 + " and " + num3 + " are equal and largest");
		} else if (num2 > num1 & num2 > num3) {
			System.out.println(num2 + " is the largest number.");
		} else if (num3 > num1 & num3 > num2) {
			System.out.println(num3 + " is the largest number.");
		} else if (num1 == num2 & num2 == num3) {
			System.out.println("All numbers are equal");
		}
		// oguzky7
	}

}

package com.syntax.class08;

public class task3 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 
		 * except those that are divisible by 3
		 */

		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println(" -------------------------------------- ");

		for (int i = 1; i <= 3; i++) {
			System.out.println("Hello");

			for (int y = 1; y <= 2; y++) {
				System.out.println("Bye");
			}
		}

	}

}

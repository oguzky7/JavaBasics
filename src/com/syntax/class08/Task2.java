package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int secret = 7;

		System.out.println("there is a number. can you guess it?");

		System.out.println("enter a number: ");

		for (int i = 1; i < 2;) {
			int guess = input.nextInt();

			if (guess < secret) {
				System.out.println("enter a bigger value");
			} else if (guess > secret) {
				System.out.println("enter a smaller value");
			} else if (guess == secret) {
				System.out.println("Congrats");

				i = 7;
			}
		}

	}

}

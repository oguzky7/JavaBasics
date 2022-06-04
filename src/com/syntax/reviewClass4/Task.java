package com.syntax.reviewClass4;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		/*
		 * take the input from the user using scanner increment it by 2 print it if
		 * value is 10 terminate the program
		 */

		int x = 0;
		Scanner input = new Scanner(System.in);

		while (x != 10) {
			System.out.println("Please enter the number");
			x=input.nextInt();
			System.out.println(x+2);
			
		}
		input.close();
			
	}
}

package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quiz Score?");
		double quiz = input.nextDouble();
		System.out.println("Mid Term Score?");
		double mid = input.nextDouble();
		System.out.println("Final Score?");
		double fin = input.nextDouble();

		double AverageS = ((quiz + mid + fin) / 3);
		System.out.println("Your average score is " + AverageS);

		char grade=0;

		if (AverageS >= 90) {
			grade = 'A';

		} else if (AverageS >= 70 && AverageS < 90) {
			grade = 'B';

		} else if (AverageS >= 50 && AverageS < 70) {
			grade = 'C';

		} else  if (AverageS < 50){
			grade = 'F';
		}
			System.out.println("Your grade is " + grade);
	}

}

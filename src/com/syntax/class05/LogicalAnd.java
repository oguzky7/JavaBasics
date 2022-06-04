package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		/*
		 * AND &&
		 * true && true		--> true
		 * true && false	--> false
		 * false && true	--> false
		 * false && false	--> false
		 */

		boolean job = true;
		double salary = 75000;

		if (job && salary >= 100000) { // this one is checking job and salary conditions one by one
			System.out.println("I'm super happy");
		} else {
			System.out.println("Still happy but...");
		}
		System.out.println("---------------------------------------");

		boolean study = true;
		boolean homework = false;
		boolean practice = true;

		if (study && homework && practice) {
			System.out.println("You will succed in the course");
		} else {
			System.out.println("You will struggle");
		}
		System.out.println("---------------------------------------");
		
		/*
		 * Write a program to find largest number among three numbers using
		 */
		int num1, num2, num3;
		num1=65;
		num2=66;
		num3=23;
		
		if(num1>num2 && num1>num3) {
			System.out.println("The largest number is "+num1);
		}else if(num3>num1 && num3>num2) {
			System.out.println("The largest number is "+num3);
		}else if(num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}

	}

}

package com.syntax.reviewClass2;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		Scanner Obama=new Scanner(System.in);
		System.out.println("Please Enter your Account balance");
		double accountBalance=Obama.nextDouble();
		
		System.out.println("please Enter the amount that you want to lend to your friend");
		double amountToLend=Obama.nextDouble();
		
		if (accountBalance>=amountToLend) {
			System.out.println("Yes I can help you");
		}else {
			System.out.println("Sorry I don't have enough money");
		}
		
		
	}

}

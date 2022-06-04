package com.syntax.class03;

public class TemperatureCheck {
	public static void main(String[] args) {
		/*
		 * Create a Java program and name it Temperature Check. Create variable to store
		 * temperature. Your program should check if temperature is below 32 then it
		 * should print “Water will freeze with temperature __“, otherwise “Water will
		 * NOT freeze with temperature __“.
		 */
		//When there are no errors in the code,
		//you can format it (make it nice)
		//ctrl+shift+f
		
		
		//int temp = 15;
		int temp = 67;

		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
			System.out.println("It is cold outside");
			System.out.println("make sure to use jacket and a scarf");
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
			System.out.println("It is not that cold outside then");
		}
		
		System.out.println("I am code outside of if block");
		// oguzky7
	}
}

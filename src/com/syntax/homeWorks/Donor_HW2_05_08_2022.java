package com.syntax.homeWorks;

public class Donor_HW2_05_08_2022 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and call it a Donor. In order to be eligible to donate
		 * your blood you have to be 18 years old. Also once you identify age
		 * eligibility then we have to see if person matches weight requirements. If
		 * person weight it more than 110 lbs, then he/she is eligible, otherwise we
		 * cannot accept such a patient.
		 */
		int age = 18;
		int weight = 111;

		if (age >= 18) {
			System.out.println("You are old enough to give blood.");
			if (weight > 110) {
				System.out.println("Your weight is enough to give blood.");
				System.out.println("Congratulations, You are eligible to be a Donor! ");
			} else if (weight <= 110) {
				System.out.println("Unfortunately your weight is not enough to give blood.");
			}
		} else {
			System.out.println("You are not old enough to be give blood.");
		}
		// oguzky7
	}
}

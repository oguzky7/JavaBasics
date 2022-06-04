package com.syntax.class08;

public class LoopTask {

	public static void main(String[] args) {

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 70; i++) {

			if (i % 2 == 0) {
				sumEven += i;
			} else if (i % 2 == 1) {
				sumOdd += i;
			}

		}
		System.out.println("sum of even numbers: " + sumEven);
		System.out.println("sum of odd numbers: " + sumOdd);
	}

}

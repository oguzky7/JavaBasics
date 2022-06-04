package com.syntax.reviewclass5;

public class BreakManager {
	public static void main(String[] args) {

		int i = 0;
		while (i < 5) {
			if (i > 2) {
				break;

			}
			System.out.println("Zameer is fired");
			i++;
		}
		System.out.println("We are done looping");
	}
}

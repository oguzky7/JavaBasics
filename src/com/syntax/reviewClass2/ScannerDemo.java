package com.syntax.reviewClass2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter your age");
		int age=scanner.nextInt(); //user enters the number and hits the enter key
		
		scanner.nextLine(); //consumes the enter that user press after the number
		
		
		System.out.println("Please Enter you name");
		String name=scanner.nextLine();
		//String name=scanner.next();
		
		System.out.println(age+name);
		
		
		
				
	}

}

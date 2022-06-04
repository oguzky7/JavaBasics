package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		

		char choice='N';
		
		String meaning;
		
		switch(choice) {
		
		case 'Y':
			meaning="Yes";
			break;
		case 'M':
			meaning="Maybe";
			break;
		case 'N':
			meaning="No";
			break;
		default:
			meaning="Unknown";
			break;
		}
		
		System.out.println(meaning);
	}

}

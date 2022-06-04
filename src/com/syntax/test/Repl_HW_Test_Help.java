package com.syntax.test;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_HW_Test_Help {
	public static void main(String[] args) {

		int[] years = new int[11];
		
		for(int i = 0; i<years.length; i++) {
			
			years[i]=2010+i;
			
			System.out.println(years[i]);
			
		}
		System.out.println(Arrays.toString(years));
		
		
		}

	}


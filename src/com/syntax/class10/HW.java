package com.syntax.class10;

public class HW {

	public static void main(String[] args) {

		double[] num = { 2.99, 3.99, 4.99, 5 };
		for (double x : num) {
			//System.out.print(x + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			//System.out.println(num[i] + " ");
		}
		
		int [] numbers= {10,222,3,4,5};
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
		}
		System.out.println("Sum of all elements = "+sum);
		
		sum=0;
		
		for (int n:numbers) {
			sum+=n;
			
		}
		System.out.println("Sum of all elements = "+sum);
		
		
	}

}

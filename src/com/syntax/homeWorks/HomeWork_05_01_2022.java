package com.syntax.homeWorks;

public class HomeWork_05_01_2022 {

	public static void main(String[] args) {
		/*
			1- Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. 
			   “The _______ of 2 numbers ___ and ___ is equal to _____”
		 
			2- Write a program to find the square of the number 3.9. You program should say “The square of the ____ is ____ ”

			3- Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8. Your program should say. 
			 “The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __
		 ------------------------------------------------------------------------------------------------------*/
		System.out.println("Part 1");
		double num1, num2, sum, sub, mult, div;
		num1=21.98;
		num2=3.14;
		sum=num1+num2;
		sub=num1-num2;
		mult=num1*num2;
		div=num1/num2;
		System.out.println("the sum of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("the sub of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("the mult of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("the div of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		System.out.println("");
		//------------------------------------------------------------------------------------------
		System.out.println("Part 2");
		double num3, num4;
		num3= 3.9;
		num4=num3*num3;
		System.out.println("The square of the "+num3+" is "+num4);
		System.out.println("");
		//------------------------------------------------------------------------------------------
		System.out.println("Part 3");
		int width, height, perimeter, area;
		width=5;
		height=8;
		area=width*height;
		perimeter=2*(width+height);
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);  
		
	}

}

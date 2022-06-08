package com.syntax.class11;

import java.util.Scanner;

public class Dog {
	
	// Attributes how the object will look like
	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;

	// How that object behave

	void bark() {
		System.out.println("Dog barks");
	}

	void walks() {
		System.out.println("Dog walks");
	}

	void eat() {
		System.out.println("Dogs like to eat bone");

	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		input.next();
		
		
		Dog jimmy= new Dog();	//Creating an object and stroing in a variable
		
		//new Dog() how we create an object
		jimmy.name="Jimmy";
		jimmy.age=6;
		jimmy.weight=16;
		jimmy.color="Pink";
		jimmy.height=2.6;
		jimmy.breed="German";
		jimmy.bark();
		
		
	}

}


package com.syntax.class11;

public class Car {

	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int NoOfDoors;
	int HP;
	
	void moveForward(){
		System.out.println("Car is moving forward");
		
	}
	void reverse() {
		System.out.println("Moving backwards");
	}
	
		
	public static void main(String[] args) {
		Car bmw=new Car();
		bmw.model="X6";
		bmw.make="BMW";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfEngine="V8";
		bmw.HP=500;
		
		bmw.moveForward();
		bmw.reverse();
		
		Car lexus=new Car();
		lexus.model="LFA";
		lexus.make="Lexus";
		lexus.color="White";
		//lexus.year=2020;
		//lexus.typeOfEngine="V8";
		//lexus.HP=500;
		lexus.moveForward();
		
		
	}

}

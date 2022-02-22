package com.bridgelabz.car;

abstract class Car {
	int speed;
	double regularPrice;
	String color;

	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	abstract double getSalePrice();
}

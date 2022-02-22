package com.bridgelabz.car;

public class MyOwnAutoShop {
	public static void main(String args[]) {
		Car truck = new Truck(100, 500000, "Black",1000);
		truck.getSalePrice();
		Car ford = new Ford(120, 1000000, "Blue");
		ford.getSalePrice();
		Car sedan = new Sedan(160, 1200000, "Red", 10);
		sedan.getSalePrice();
	}
}

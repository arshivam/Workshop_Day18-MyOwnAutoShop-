package com.bridgelabz.car;

public class Ford extends Car {
	int year = 2022;
	int manufacturingDiscount = 100000;
	double salePrice;

	public Ford(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
	}

	@Override
	double getSalePrice() {
		System.out.println("For Ford :");
		salePrice = regularPrice - manufacturingDiscount;
		System.out.println("saleprice is : "+salePrice);
		return salePrice;
	}	

}

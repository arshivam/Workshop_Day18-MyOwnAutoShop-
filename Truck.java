package com.bridgelabz.car;

public class Truck extends Car {
	int weight;
	double salePrice;

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	@Override
	double getSalePrice() {
		System.out.println("For Truck :");
		if(weight>2000) {
			double DiscountPrice = regularPrice * 0.10;//discount=10%
			salePrice = regularPrice - DiscountPrice;
			System.out.println("saleprice is :"+salePrice);
		}
		else {
			double DiscountPrice = regularPrice * 0.20;//discount=20%
			salePrice = regularPrice - DiscountPrice;
			System.out.println("saleprice is :"+salePrice);
		}
		return salePrice;
	}

}

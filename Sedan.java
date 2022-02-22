package com.bridgelabz.car;

public class Sedan extends Car {	
	int length;
	double salePrice;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	@Override
	double getSalePrice() {
		System.out.println("For Sedan :");
		if(length>20) {
			double DiscountPrice = regularPrice * 0.05;//discount=5%
			salePrice = regularPrice - DiscountPrice;
			System.out.println("saleprice is : "+salePrice);
		}
		else {
			double DiscountPrice = regularPrice * 0.10;//discount=10%
			salePrice = regularPrice - DiscountPrice;
			System.out.println("saleprice is : "+salePrice);
		}
		return salePrice;
	}

}

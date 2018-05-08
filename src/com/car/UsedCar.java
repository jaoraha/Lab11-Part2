// Title: Lab No 11 Part 2
// Author: John Aoraha
// Date: May 7, 2018

package com.car;

public class UsedCar extends Car {
	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;}

		@Override
		public String toString() {
			return String.format("%-10s %-10s %-10s $%.2f %-10s %.2f %-10s", make, model, year, price, "(Used)", mileage, "miles");
	}
		
	}


// Title: Lab No 11 Part 2
// Author: John Aoraha
// Date: May 7, 2018

package com.car;

public class Car {

	public String make;
	public String model;
	public int year;
	public double price;

	public Car() {
		make = "";
		model = "";
		year = 0;
		price = 0;
	}

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
	return String.format("%-10s %-10s %-10s $%.2f", make, model, year, price);

	
}}

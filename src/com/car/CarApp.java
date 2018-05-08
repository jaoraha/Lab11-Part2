// Title: Lab No 11 Part 2
// Author: John Aoraha
// Date: May 7, 2018

package com.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cont = "y";
		int carNum;
		int selection;

		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Car("Nikolai", "Model S", 2017, 54999.90));
		carList.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		carList.add(new Car("Chewie", "Vette", 2017, 44989.95));
		carList.add(new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.6));
		carList.add(new UsedCar("GC", "Chirpus", 2013, 8500.00, 12345.0));
		carList.add(new UsedCar("GC", "Witherell", 2016, 14450.00, 3500.3));

		do {
			carNum = 1;
			for (int i = 0; i < carList.size(); i++) {
				System.out.println(carNum + "." + carList.get(i));
				carNum++;
			}
			System.out.println(carNum + ".Quit.");

			selection = Validator.getInt(scan, "Which car would you like? ", 1, carNum);

			if (selection < carNum) {

				System.out.println(carList.get(selection - 1));

				System.out.println("Would you like to buy this car?");
				cont = scan.next();

				if (cont.equalsIgnoreCase("y")) {

					System.out.println("Excellent! Our finance department will be in touch shortly.");
					carList.remove(selection - 1);

				}

			}

		} while (selection < carNum);

		System.out.println("Have a great day!");

	}

}
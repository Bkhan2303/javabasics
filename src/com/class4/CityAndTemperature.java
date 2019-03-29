package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		System.out.println("Please enter your city");
		String userCity = userInput.nextLine();
		System.out.println("Please enter your city's temperature in Fahrenheit");
		int userTemp = userInput.nextInt();
		int celsius = (userTemp - 32) * 5 / 9;
		System.out.println("Thank you! Your City, " + userCity + ", has a temperature of " + celsius + "°C");
	}

}
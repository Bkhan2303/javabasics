package com.class4;

import java.util.Scanner;

public class DriverLicense {
	private static Scanner userInput;

	public static void main(String[] args) {
		System.out.println("Welcome to the DMV, Please enter your age");
		userInput = new Scanner(System.in);
		int driverAge = userInput.nextInt();
		if (driverAge < 18) {
			System.out.println("You can only apply for a drivers permit at this time");
		}
		if (driverAge >= 18) {
			System.out.println("Congratulations! You qualify for a Drivers License");
		}
	}
}
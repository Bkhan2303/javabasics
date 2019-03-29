package com.class4;

import java.util.Scanner;

public class ScannerClass2 {
	private static Scanner userInput;

	public static void main(String[] args) {

		userInput = new Scanner(System.in);
		System.out.println("Please enter your name");
		String userName = userInput.nextLine();
		System.out.println("Good Morning " + userName);
	}
}

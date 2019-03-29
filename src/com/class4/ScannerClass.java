package com.class4;

import java.util.Scanner;

public class ScannerClass {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Please enter any number");
		int userNumber = scanner.nextInt();
		System.out.println("Your number is " + userNumber);
	}

}

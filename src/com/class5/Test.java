package com.class5;
import java.util.Scanner;

public  class Test {
	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String string1 = userInput.nextLine();
		String string2 = userInput.nextLine();
System.out.println("Please enter two numbers");
		int num1 = userInput.nextInt();
		int num2 = userInput.nextInt();

		if (string1 == string2 && num1 == num2) {
			System.out.println("AND");
		} else if (num1 == num2 || string1 == string2) {
			System.out.println("OR");
		} else {
			System.out.println("NONE");
		}
	}
}
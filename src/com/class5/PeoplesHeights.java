package com.class5;

import java.util.Scanner;

public class PeoplesHeights {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Please enter person A's name");
		String nameA = input.nextLine();
		System.out.println("Please enter person B's name");
		String nameB = input.nextLine();
		System.out.println("Please enter " + nameA + "'s height in feet");
		double heightA = input.nextDouble();
		System.out.println("Please enter " + nameB + "'s height in feet");
		double heightB = input.nextDouble();
		if (heightA < 5) {
			System.out.println(nameA + " is Short");
		} else if (heightA >= 5 && heightA <= 6) {
			System.out.println(nameA + " is medium height");
		} else if (heightA > 6) {
			System.out.println(nameA + " is Tall");
		}
		if (heightB < 5) {
			System.out.println(nameB + " is Short");
		} else if (heightB >= 5 && heightB <= 6) {
			System.out.println(nameB + " is medium height");
		} else if (heightB > 6) {
			System.out.println(nameB + " is Tall");
		}
	}

}

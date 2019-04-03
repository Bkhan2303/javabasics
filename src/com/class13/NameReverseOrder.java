package com.class13;

import java.util.Scanner;

public class NameReverseOrder {

	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Please enter a name");
		input = new Scanner(System.in);
		String name = input.nextLine();
		for (int i = name.length(); i > 0; i--) {
			System.out.print(name.charAt(i - 1));
		}

	}

}

package com.class4;

import java.util.Scanner;

public class NestedIf {

	private static Scanner userInput;

	public static void main(String[] args) {
		
		userInput = new Scanner(System.in);
		System.out.println("Hello Please list your age");
		int userAge = userInput.nextInt();
		if(userAge<16) {
			System.out.println("Sorry you're not old enough to work");
		}else {
			System.out.println("You are eligble to work");
			if (userAge>=64) {
				System.out.println("Though you're elligble to work, I'd recommend you enjoy your life since you're "+userAge+" years old");
			}
		}
	}

}

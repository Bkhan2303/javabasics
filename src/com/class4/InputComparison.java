package com.class4;

import java.util.Scanner;

public class InputComparison {
	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int num1,num2;
		System.out.println("Please enter an Interger");
		num1=userInput.nextInt();
		System.out.println("Please enter another Integer");
		num2 = userInput.nextInt();
		if(num1>num2) {
			System.out.println(num1 +" is greater than "+num2);
		}
		if (num2>num1) {
			System.out.println(num2+" is greater than " +num1);
		}
		if (num1==num2) {
			System.out.println("The numbers are equal");
		}
	}

}

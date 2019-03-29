package com.class4;

import java.util.Scanner;

public class LoanAquisition {
	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		System.out.println("Hello welcome to Khan lending Company");
		System.out.println("How much money would you like to Loan?");
		int userLoan = userInput.nextInt();
		if (userLoan <= 200000) {
			System.out.println("Congrats You approve for the loan of " + userLoan + "$");
		} else {
			System.out.println("I'm Sorry but your max loan approval is 200,000$");
		}
	}

}

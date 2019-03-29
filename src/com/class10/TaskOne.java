package com.class10;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		int oddSum=0;
		int evenSum=0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a low range integer!");
		int lowInt = userInput.nextInt();
		System.out.println("Please enter a high range integer!");
		int highInt = userInput.nextInt();
		if(lowInt<highInt) {
		for (int i =lowInt; i<=highInt; i++) {
			if (i%2==0) {
				evenSum+=i;
				
			}if (i%2==1) {
				oddSum+=i;
			}
		
		}
		System.out.println("The sum of all odd numbers from " + lowInt + " to " + highInt + " is " +oddSum);
		System.out.println("The sum of all even numbers from " + lowInt + " to " + highInt + " is " +evenSum);
		}
	}

}

package com.class5;

import java.util.Scanner;

public class ScoreSummary {

	private static Scanner userInput;

	public static void main(String[] args) {

		userInput = new Scanner(System.in);
		System.out.println("Enter your Quiz score");
		int quizScore = userInput.nextInt();
		System.out.println("Enter your Mid-term score");
		int midTermScore = userInput.nextInt();
		System.out.println("Enter your Final score");
		int finalScore = userInput.nextInt();
		int avgScore = (quizScore + midTermScore + finalScore) / 3;
		if (avgScore >= 90) {
			System.out.println("Your grade " + avgScore + " is an A");
		} else if (avgScore >= 70 && avgScore < 90) {
			System.out.println("Your grade " + avgScore + " is a B");
		} else if (avgScore >= 50 && avgScore < 70) {
			System.out.println("Your grade " + avgScore + " is a C");
		} else if (avgScore < 50) {
			System.out.println("Your grade look like a muhfuckin uhhhhhhhhhh");
		}
	}
}

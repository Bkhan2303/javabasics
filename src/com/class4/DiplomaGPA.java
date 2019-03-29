package com.class4;

import java.util.Scanner;

public class DiplomaGPA {

	public static void main(String[] args) {
		Scanner userInput= new Scanner(System.in);
		System.out.println("Hello! Do you have your Diploma?");
		System.out.println("Type '1' for yes and '2' for no");
		int studentDiploma = userInput.nextInt();
		if (studentDiploma == 1) {
			System.out.println("What is your GPA");
			double studentGPA = userInput.nextDouble();
			if (studentGPA>=3.5) {
				System.out.println("Congrats! You got the job");
			} else {
				System.out.println("Your GPA isn't high enough");
			}
		if (studentDiploma ==2) {
			System.out.println("Sorry, we require that you have, at minimum, a highschool diploma");
		}
		}
	}

}

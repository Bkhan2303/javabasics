package com.class13;

import java.util.Scanner;

public class BabyName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter Mom's name!");
		String momName = input.nextLine();
		int momLength = momName.length();
		System.out.println("Please enter Dad's name!");
		String dadName = input.nextLine();
		int dadLength = dadName.length();
		System.out.println("What's the baby's gender?");
		System.out.println("Boy?------Girl?");
		String gender = input.nextLine();
		if (gender.equalsIgnoreCase("boy")) {
			System.out.print(dadName.substring(0,3));
	
			System.out.println(momName.substring((momLength-2),momLength));
		}else if (gender.equalsIgnoreCase("girl")) {
			System.out.print(momName.substring(0,3));
			System.out.println(dadName.substring((dadLength-2),dadLength));
		}
		
	}

}

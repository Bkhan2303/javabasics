package com.class13;

import java.util.Scanner;

public class UsernamePass {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please Input Your Username!");
		String userName = userInput.nextLine();
		while (userName.isEmpty()) {
			System.out.println("Username cannot be empty");
			System.out.println("Please Input Your Username!");
			userName = userInput.nextLine();
		}
		System.out.println("Please Input your Password!");
		System.out.println("Minimum of 8 Characters");
		String password = userInput.nextLine();
		boolean contains = password.contains(userName);
		int passwordLength = password.length();
		while (passwordLength < 8) {
			System.out.println("Password is too short");
			System.out.println("Please Input your Password!");
			System.out.println("Minimum of 8 Characters");
			password = userInput.nextLine();
			passwordLength = password.length();
		}
		while (contains) {
			System.out.println("Password cannot contain username");
			password = userInput.nextLine();
			contains = password.contains(userName);
		}
		System.out.println("Please confirm your password");
		String confPass = userInput.nextLine();
		boolean compare = confPass.equals(password);
		 while (!compare) {
			System.out.println("Passwords do not match");
			System.out.println("Please Confirm Password");
			confPass = userInput.nextLine();
			compare =confPass.equals(password);
		 }
		 if (compare) {
			System.out.println("Your Username and Password have been set up!");
		}

	}

}

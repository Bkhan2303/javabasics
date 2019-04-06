package com.class17;

public class Palindrome {

	void checker(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (reverse.equalsIgnoreCase(word)) {
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		Palindrome obama = new Palindrome();
		obama.checker("AManAPlanACanalPanama");

	}

}

package com.class14;

public class StringNoSpaces {

	public static void main(String[] args) {
		String sentence = "Hello my name is Bilal Khan!";
		System.out.println(sentence.replaceAll("[^A-Za-z]", ""));

	}

}

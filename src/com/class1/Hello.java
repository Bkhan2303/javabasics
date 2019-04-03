package com.class1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		String str = "12Hello 32324 World 4546^ &* ";
		str = str.replaceAll("[0-9]", "");
		str = str.replaceAll("[^A-Z a-z]", "");
		System.out.println(str);
		boolean check = str.contains("[A-Za-z]");
		System.out.println(check);

	}
}

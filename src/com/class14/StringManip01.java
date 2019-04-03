package com.class14;

public class StringManip01 {

	public static void main(String[] args) {

		String original = "Today is Java Class";
		String[] array =original.split(" ");
		for(String group:array) {
			System.out.println(group);
		}

	}
}

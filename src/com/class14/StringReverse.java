package com.class14;

public class StringReverse {

	public static void main(String[] args) {

		String sentence = "Today we are given some important interview questions ";

		String reverse1 = "";

		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse1 = reverse1 + sentence.charAt(i);

		}
		String[] split = reverse1.split(" ");
		for (int i=split.length-1;i>0;i--) {
			System.out.print(split[i]+" ");
		}

	}

}

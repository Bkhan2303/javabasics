package com.class14;

public class SentenceCalc {

	public static void main(String[] args) {
		
		String a="What are we doing here? Is this real life? 9/11 was an inside job!";
		String[] aSplit = a.split("\\? ");
		System.out.println(aSplit.length);
	}
}

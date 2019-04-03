package com.class14;

public class SwappingInts {

	public static void main(String[] args) {
		int x = 12;
		int y = 8;
		System.out.println("Before swapping x = " + x + " And y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping x = " + x + " And y = " + y);

		String a = "Hello";
		String b = "World";

		System.out.println("Strings before swap: a = " + a + " and b = " + b);
		a = a + b;

		b = a.substring(0, a.length() - b.length());

		a = a.substring(b.length());

		System.out.println("Strings after swap: a = " + a + " and b = " + b);
	}
}
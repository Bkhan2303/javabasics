package com.class19;

import java.util.Scanner;

public class Calculator {
	int sum(int a, int b, int c) {
		int add = a + b + c;
		return add;
	}

	int average(int a, int b, int c) {
		int sub = (a + b + c) / 3;
		return sub;
	}

	int max(int a, int b, int c) {
		int maxInt = 0;
		if (a > b && a > c) {
			maxInt = a;
		} else if (b > a && b > c) {
			maxInt = b;
		} else if (c > a && c > b) {
			maxInt = c;
		}
		return maxInt;

	}

	int min(int a, int b, int c) {
		int minInt = 0;
		if (a < b && a < c) {
			minInt = a;
		} else if (b < a && b < c) {
			minInt = b;
		} else if (c < a && c < b) {
			minInt = c;
		}
		return minInt;

	}

	public static void main(String[] args) {
		System.out.println("Please enter three distinct numbers!");
		Calculator obj = new Calculator();
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		System.out.println("The sum of these numbers is "+obj.sum(a, b, c) );
		System.out.println("The Average of these numbers is "+obj.average(a, b, c));
		System.out.println("The Max of these numbers is "+obj.max(a, b, c));
		System.out.println("The min of these numbers is "+obj.min(a, b, c));

	}

}

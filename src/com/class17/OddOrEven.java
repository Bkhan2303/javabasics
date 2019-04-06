package com.class17;

import java.util.Scanner;

public class OddOrEven {
	Scanner input = new Scanner(System.in);

	void oddOrEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is an even number");
		} else {
			System.out.println(a + " is an odd number");
		}

	}

	public static void main(String[] args) {
		OddOrEven check = new OddOrEven();
		check.oddOrEven(15);

	}

}

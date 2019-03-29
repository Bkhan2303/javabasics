package com.class4;

public class MortgageRate {

	public static void main(String[] args) {
		double mortgageRate = 3.0;
		int housePrice = 20000;
		if (mortgageRate > 4.5) {
			System.out.println("The rate is too damn high, you probably shouldn't buy a house");
		} else {
			if (housePrice < 200000) {
				System.out.println("You should buy the house without a loan");
			} else {
				System.out.println("You should buy the house with a loan");
			}
		}
	}

}

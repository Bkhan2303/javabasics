package com.class11;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		int sum =0;
		Scanner input = new Scanner(System.in);
//		String[] cars= {"Honda","Toyota","Ford","Chevy","Mazda","Lexus"};
//		for(int i=0; i<cars.length;i++) {
//			System.out.println(cars[i]);
//		}
//		for(String carGrouping:cars) {
//			System.out.println(carGrouping);
//		}
		System.out.println("how many values will you add?");
		int indexs = input.nextInt();
		int[] numbers =new int[indexs];
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Please put value " +(i+1));
			numbers[i]= input.nextInt();
			sum = numbers[i]+ sum;
		}
		System.out.println("The sum of these numbers is "+sum);
	}

}

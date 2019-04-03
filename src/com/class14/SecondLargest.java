package com.class14;

public class SecondLargest {

	public static void main(String[] args) {
		int[] array = { 65, 56, 48, 55, 12, 89, 100, 1789, 35 };
		int largest = array[0];
		int secLarge = array[0];
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (largest < array[i]) {
				secLarge = largest;
				largest = array[i];
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
			}
		}
		System.out.println("Second largest is " + secLarge);
		System.out.println("Maximum is " + largest);
		System.out.println("Minimum is " + smallest);
	}
}

package com.class19;

public class Minimum {


	int minOfValues(int[] my_array) {
		int min = my_array[0];
		for (int i = 0; i < my_array.length; i++) {
			if (my_array[i] < min) {
				min = my_array[i];
			}
		}
		return min;
	}
}

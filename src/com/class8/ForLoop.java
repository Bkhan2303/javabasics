package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+" ");

		}
		System.out.println(" ");

		for (int i = 100; i >= 1; i--) {
			System.out.print(i+" ");

		}

		System.out.println(" ");
		for (int i = 1; i < 20; i += 2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for (int i = 20; i >1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for (int i = 20; i <= 50; i += 2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for (int i = 21; i <= 49; i += 2) {
			System.out.print(i+" ");
		}
	}
}
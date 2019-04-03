package com.class16;

public class Computer {

	boolean mouse;
	boolean keyboard;
	int ram;
	String os;

	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.mouse = true;
		com1.keyboard = true;
		com1.ram = 8;
		com1.os = "Windows";

	}

	void brake() {
		System.out.println("Car can brake");
	}

	void reverse() {
		System.out.println("Car can reverse");
	}

	void drive() {
		System.out.println("Car can drive");
	}

}

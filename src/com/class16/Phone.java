package com.class16;

public class Phone {
	String model, chargerType;
	int resolution, memory;

	public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.model = "X S Max";
		iPhone.chargerType = "Lightning Cable";
		iPhone.resolution = 4000;
		iPhone.memory = 256;
		iPhone.calls();
		iPhone.memorySize();
		iPhone.screenRes();

		Phone android = new Phone();
		android.model = "Oneplus One";
		android.chargerType = "MicroUsb";
		android.resolution = 1080;
		android.memory = 64;
		android.calls();
		android.memorySize();
		android.screenRes();

		Phone windows = new Phone();
		windows.model = "Nokia Lumia";
		windows.chargerType = "Proprietary Charger";
		windows.resolution = 720;
		windows.memory = 16;
		windows.calls();
		windows.memorySize();
		windows.screenRes();

	}

	void calls() {
		System.out.println("The " + model + " can make calls");
	}

	void memorySize() {
		System.out.println("The " + model + " has up to " + memory + "gb available");
	}

	void screenRes() {
		System.out.println("The " + model + " has a display quality of " + resolution + " pixels per inch");
	}

}

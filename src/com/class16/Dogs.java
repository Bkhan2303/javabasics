package com.class16;

public class Dogs {

	String breed, color;
	int year;
	boolean angryDog;

	public static void main(String[] args) {

		Dogs dog1 = new Dogs();
		dog1.breed = "Hasky";
		dog1.angryDog = false;
		dog1.color = "Grey";
		dog1.year = 3;

		Dogs dog2 = new Dogs();
		dog2.breed = "Bulldog";
		dog2.angryDog = true;
		dog2.color = "Black";
		dog2.year = 5;

		Dogs dog3 = new Dogs();
		dog3.breed = "Labrador";
		dog3.angryDog = false;
		dog3.color = "White";
		dog3.year = 7;

	}

	void bark() {
		System.out.println("Woow Woof!!!");
	}

	void sit() {
		System.out.println(breed + " can sit");
	}

	void hunt() {
		System.out.println(breed + " can hunt");
	}

}

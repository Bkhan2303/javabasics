package com.class11;

public class Recap {

	public static void main(String[] args) {
		// array index out of bounds
		String[] names = new String[5];
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Wallpaper";
		names[4]="Vishnu";
		for (int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		String[] studentNames = {"Shaban", "Bilal", "Asha", "Weqas the wallpaper"};
		for (int i=0; i<studentNames.length; i++) {
			System.out.println(studentNames[i]);
		}
		for (String student: studentNames) {
			System.out.print(student+" ");
		}

	}

}

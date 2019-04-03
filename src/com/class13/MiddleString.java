package com.class13;

public class MiddleString {

	public static void main(String[] args) {
		String name = "BilalKhan";
		
		if (!name.isEmpty()) {
			
			if (name.length() >= 3) {
				
				if (name.length() % 2 == 1) {
					
					System.out.println(name.charAt(name.length() / 2));
				}
			}
		}
	}

}

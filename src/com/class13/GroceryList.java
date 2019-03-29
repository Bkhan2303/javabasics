package com.class13;

public class GroceryList {

	public static void main(String[] args) {
//		String[][] lists= {{"Apples","Bananas","Orange","Peaches"},
//						   {"Cabbage","Broccoli","Tomatoes","Potatoes"},
//						   {"Milk","Cheese","Yogurt","Butter","Extra Cheese"}};
//		for (int i=0;i<lists.length;i++) {
//			for(int j=0; j<lists[i].length;j++) {
//				System.out.print(lists[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("-----------------------");
//		for (String[] rows:lists) {
//			for(String items:rows) {
//				System.out.print(items+" ");
//			}
//			System.out.println();
//		}
		String str1="Extra cheese";
		String str2="extra    cheese";
		boolean testing = str1.contentEquals(str2);
		System.out.println(testing);
	}

}

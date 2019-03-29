package com.class1;

import java.util.Scanner;

public class Hello 
{

	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		   if (language.equals("Java")){
			   System.out.println("Java is a programming language");
		   }
		  
		  }
}
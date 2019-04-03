package com.class14;

public class StringCombos {

	public static void main(String[] args) {
		String combo = "&$*#(&#*(&$*(The Tru&*($&*(%&th I*()*)213s O*&#*(&$*(ut T48932($)*he*()$#*)(re";
		String alphabet = combo.replaceAll("[^A-Za-z]", "");
		System.out.println(alphabet+" has "+alphabet.length()+" letters");
		
	}

}

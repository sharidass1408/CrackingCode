package com.chapter1.pg172;

public class StringWithUniqueCharacters {

	public static void main(String[] args) {
		
		String str1 = "abcde";
		String str2 = "abcade";
		String str3 = "abcdefa";
		
		System.out.println("st1 has unique characters: " + uniqueCharacters(str1));
		System.out.println("st2 has unique characters: " + uniqueCharacters(str2));
		System.out.println("st3 has unique characters: " + uniqueCharacters(str3));

	}

	private static boolean uniqueCharacters(String str) {
		return false;
	}

	
	
}

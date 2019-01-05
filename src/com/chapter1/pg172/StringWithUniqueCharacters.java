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
		
		int[] charArray = new int[256];
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if( charArray[ch] == 1) {
				return false;
			}
			else {
				charArray[ch] = 1;
			}
			
		}
		
		return true;
	}

}

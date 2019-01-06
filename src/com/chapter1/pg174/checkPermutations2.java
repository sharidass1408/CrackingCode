package com.chapter1.pg174;

public class checkPermutations2 {

	public static void main(String[] args) {
		String str1 = "dog";
		String str2 = "god";
		String str3 = "gode"; 
		
		System.out.println("String are permutations of each other: " + permutation(str1, str2));
		
		System.out.println("String are permutations of each other: " + permutation(str1, str3));
	}

	private static boolean permutation(String str1, String str2) {
		
		
		if(str1.length() != str2.length())
			return false;
		
		int[] charArray = new int[256];
		
		for(int i = 0; i < str1.length(); i++ ) {
			charArray[str1.charAt(i)] ++;
		}
		
		for(int i = 0; i < str2.length(); i++ ) {
			 
			if(--charArray[str2.charAt(i)] <0 )
				return false;
			
		}
		
		return true;
	}
}

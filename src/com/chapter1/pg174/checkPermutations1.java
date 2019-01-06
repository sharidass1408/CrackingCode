package com.chapter1.pg174;

import java.util.Arrays;

public class checkPermutations1 {

	public static void main(String[] args) {
		String str1 = "dog";
		String str2 = "god";
		
		System.out.println("String are permutations of each other: " + permutation(str1, str2));
	}

	private static boolean permutation(String str1, String str2) {
		
		if(str1.length() != str2.length() )
			return false;
		
		char[] str1Char = str1.toCharArray();
		Arrays.sort(str1Char);
		
		char[] str2Char = str2.toCharArray();
		Arrays.sort(str2Char);
		
		for(int i = 0; i < str1Char.length; i++) {
			
			if(str1Char[i] != str2Char[i])
				return false;
				
		}
		return true;
		
	}

}

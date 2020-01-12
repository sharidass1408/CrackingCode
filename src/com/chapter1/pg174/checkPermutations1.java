package com.chapter1.pg174;

import java.util.Arrays;

public class checkPermutations1 {

	public static void main(String[] args) {
		String str1 = "dog";
		String str2 = "god";
		String str3 = "caat";
		String str4 = "atac";
		String str5 = "c  aat";
		String str6 = "caa  t";
		
		System.out.println("String are permutations of each other: " + permutation(str1, str2));
		System.out.println("String are permutations of each other: " + permutation(str1, str3));
		System.out.println("String are permutations of each other: " + permutation(str3, str4));
		System.out.println("String are permutations of each other: " + permutation(str3, str5));
		System.out.println("String are permutations of each other: " + permutation(str5, str6));
	}

	private static boolean permutation(String str1, String str2) {

		
		return false;
						
	}

}

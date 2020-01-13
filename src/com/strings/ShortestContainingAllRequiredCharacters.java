package com.strings;

/**
 * 
 * @author sai
 * Questions:
 * Given a string, find the length of the shortest substring without 
 * repeating characters. For example, the shortest substring without 
 * repeating letters for "dabbcabcd" is "abcd", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1
 */
public class ShortestSubStringInString {


	public static void main(String[] args) {
		
		String str1 = "dabbcabcd";
		String str2 = "bbb";
		String str3 = "babcdefgh";
		
		System.out.println("Shortest substring in: " + str1 + " is " + getShortestSubString(str1));
		System.out.println("Shortest substring in: " + str2 + " is " + getShortestSubString(str2));
		System.out.println("Shortest substring in: " + str3 + " is " + getShortestSubString(str3)); 
		
		//After searching for entier Array
		//System.out.println("Longest substring in after searching at every index of " + str3 + " is " + searchAtEveryIndexForSubString(str3));
		
		
	}

	private static String getShortestSubString(String str1) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

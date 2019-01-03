package com.string;

/**
 * 
 * @author sai
 * Questions:
 * Given a string, find the length of the longest substring without 
 * repeating characters. For example, the longest substring without 
 * repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1
 */
public class LongestSubStringInString {

	public static void main(String[] args) {
		
		String str1 = "abcabcbb";
		String str2 = "bbb";
		String str3 = "babcdefgh";
		
		System.out.println("Longest substring in: " + str1 + " is " + getLongestSubString(str1));
		System.out.println("Longest substring in: " + str2 + " is " + getLongestSubString(str2));
		System.out.println("Longest substring in: " + str3 + " is " + getLongestSubString(str3)); // fails for third case as expected is abcdefgh
		
		//After searching for entier Array
		System.out.println("Longest substring in after searching at every index of " + str3 + " is " + searchAtEveryIndexForSubString(str3));
		
		
	}

	//Preferred Solution
	private static String searchAtEveryIndexForSubString(String str3) {
		int maxSizeOfSubString = 1;
		String largestSubString = null;
		int beginIndex =0;
		int endIndex = str3.length()-1;
		
		for(int i=0; i< str3.length(); i++) {
			
			beginIndex = i;
			String subString = getLongestSubString(str3.substring(beginIndex, endIndex));
			
			if(subString.length() > maxSizeOfSubString) {
				maxSizeOfSubString = subString.length();
				largestSubString = subString;
			}
			
		}
		return largestSubString;
	}

	// Solution if 1. additional data structures are allowed and 
	            // 2. characters  are all ASCII characters
	private static String getLongestSubString(String inputString) {
		
		char[] aplhabetArray = new char[256];
		char[] inputCharArray = inputString.toCharArray();
		
		int asciiValue;
		int index = 0;
		for( char ch : inputCharArray) {
			
			asciiValue = ch;
			
			if(aplhabetArray[asciiValue] == 1)
				return inputString.substring(0, index);
			
			aplhabetArray[asciiValue] = 1;
			index++;
			
		}
		
		return inputString;
	}
	
	

}

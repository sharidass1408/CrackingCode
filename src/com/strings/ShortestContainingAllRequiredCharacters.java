package com.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 
 * @author sai
 * Questions:
 * Given a string comprised of lowercase letters in the range 
 * ascii[a-z], determine the leangth of the shortest substring that contains all 
 * of the letters present in the string.
 * 
 * example
 * s = dabbcabcd
 * 
 * The list of all characters in the string is
 * [a,b,c,d].
 * Two of the substrings that contain all letters
 * are dabbc and abcd.
 * The shortest substring containing all the letters is 4
 * characters long.
 */
public class ShortestContainingAllRequiredCharacters {

   public static char[] listOfChar = {'a','b','c','d'};
   
	public static void main(String[] args) {
		
		String str1 = "dabbcabcd";
		String str2 = "bbb";
		String str3 = "babcdefgh";
		
		System.out.println("Shortest substring in: " + str1 + " is " + getShortestSubString(str1));
		System.out.println("Shortest substring in: " + str2 + " is " + getShortestSubString(str2));
		System.out.println("Shortest substring in: " + str3 + " is " + getShortestSubString(str3)); 
		
				
	}

	private static int getShortestSubString(String string) {
		// TODO Auto-generated method stub
		
		char[] charArray = string.toCharArray();
		int shortestStringLength= 0;
		int searchStringLenght =0;
		int searchStartIndex;
		int searchEndIndex;
		String charString = listOfChar.toString();
		
		
		for (searchStartIndex = 0; searchStartIndex < string.length(); searchStartIndex++) {
			
			for(int i= searchStartIndex; i < charArray.length; i++) {
				 
				String ch = charArray[i]+"";
				 
				if(charString.contains(ch)) {
					charString.replace(ch, "");
					
					if(charString.length() == 0) {
						searchEndIndex = i;
						searchStringLenght = searchStartIndex - searchEndIndex;
						break;						
					}
				}
				
				
			}
			
			if(searchStringLenght < shortestStringLength) {
				shortestStringLength = searchStringLenght;
			}
		}		
		
		return shortestStringLength;
	}

	

}

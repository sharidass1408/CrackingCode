package com.chapter11.anagram_pg361;

import java.util.Arrays;
import java.util.Comparator;

public class GroupingAnagramsInStringsArrays_361  {

	public static void main(String[] args) {
		String[] stringArray = new String[5];
		stringArray[0] = "abcd";
		stringArray[1] = "def";
		stringArray[2] = "bacd";
		stringArray[3] = "fed";
		stringArray[4] = "bcad";
		
		stringArray[0] = "abcd";
		stringArray[1] = "bacd";
		stringArray[2] = "bcad";
		stringArray[3] = "fed";
		stringArray[4] = "def";
		
		System.out.println("String array before processing");
		for(String str : stringArray) {
			System.out.println(str);
		}
		
		Arrays.sort(stringArray, new AnagramComparator() );
		
		System.out.println("String array after processing");
		for(String str : stringArray) {
			System.out.println(str);
		}
	  }	
}
	

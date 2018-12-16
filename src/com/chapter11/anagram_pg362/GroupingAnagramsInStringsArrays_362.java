package com.chapter11.anagram_pg362;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GroupingAnagramsInStringsArrays_362  {

	public static void main(String[] args) {
		String[] stringArray = new String[6];
		stringArray[0] = "abcd";
		stringArray[1] = "def";
		stringArray[2] = "bacd";
		stringArray[3] = "fed";
		stringArray[4] = "bcad";
		stringArray[5] = "bcead";
		
		/*stringArray[0] = "abcd";
		stringArray[1] = "bacd";
		stringArray[2] = "bcad";
		stringArray[3] = "fed";
		stringArray[4] = "def";*/
		
		System.out.println("String array before processing");
		for(String str : stringArray) {
			System.out.println(str);
		}
		
		anagramSort(stringArray);
		
		System.out.println("String array after processing");
		for(String str : stringArray) {
			System.out.println(str);
		}
	  }

	private static void anagramSort(String[] stringArray) {
		// TODO Auto-generated method stub
		
		Map<String, LinkedList<String>> map = new HashMap<String,LinkedList<String>>();
		
		for(String str: stringArray) {
			String sortedStr = sortedString(str);
			if(!map.containsKey(sortedStr)) {
				map.put(sortedStr, new LinkedList<String>());
			}
			map.get(sortedStr).push(str);
		}
		
		
		int index = 0;
		for(String keyset: map.keySet()) {
			LinkedList<String> stringList = map.get(keyset);
			 
			for(String str: stringList) {
				stringArray[index] = str;
				index++;
			}
		
		}
	}

	private static String sortedString(String str) {
		
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return String.valueOf(charArray);
		
	}	
}

/**
 * Note: 
 * 1. Used LinkedList instead of ArrayList because inserting into LinkedList is much quicker
 * 2. Used LinkedList push method instead of add method because push inserts elements of at the beginning  vs add method adds them at the end
 *    LinkedList is a stack implementation and thus inserting at the beginning is better. 
 */
	

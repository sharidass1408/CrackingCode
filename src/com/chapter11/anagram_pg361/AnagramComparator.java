package com.chapter11.anagram_pg361;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator  implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return stringSort(str1).compareTo(stringSort(str2));
	}
	
	private String stringSort(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return charArray.toString();
	}
}

package com.chapter11.pg361;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String>{

	
	@Override
	public int compare(String str1, String str2) {
		return stringSort(str1).compareTo(stringSort(str2));
	}
	
	private String stringSort(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		//return charArray.toString();
		return new String(charArray);
	}

}

/*
 * String str = "wwwwww3333dfevvv";
char[] c = str.toCharArray();
Now to convert character array into String , there are two ways.

Arrays.toString(c);
Returns the string [w, w, w, w, w, w, 3, 3, 3, 3, d, f, e, v, v, v].

And:

String.valueOf(c)
Returns the string wwwwww3333dfevvv
 */

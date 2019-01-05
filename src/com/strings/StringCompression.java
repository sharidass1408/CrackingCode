package com.strings;

public class StringCompression {

	public static void main(String[] args) {
		
		String originalStr = "aaabbccdaae";
		
		System.out.println(stringCompression(originalStr));
		
				

	}

	private static String stringCompression(String originalStr) {
		char[] originalCharArray = originalStr.toCharArray();
		
		int count = 1;
		int index = 1;
		StringBuffer strBuffer = new StringBuffer();
		
		while(index < originalCharArray.length) {
			
			if(originalCharArray[index-1] == originalCharArray[index]) {
				
				count++;
				
			}else {
				
				strBuffer.append(originalCharArray[index-1]  + "" + count);
				
				if(index != originalCharArray.length -1)
					count =1;
				
			}
			
			index++;
			
		}
		
		if(originalCharArray[index-2] == originalCharArray[index-1]) {
			
			count++;
			strBuffer.replace(index-3, index-1, originalCharArray[index-1] + "" + count);
			
		} else {
			
			strBuffer.append(originalCharArray[index-1]  + "" + 1);
		}
		
		return strBuffer.toString();
	}

}

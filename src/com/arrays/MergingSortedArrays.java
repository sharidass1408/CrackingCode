package com.arrays;

public class MergingSortedArrays {

	public static void main(String[] args) {
		
		int[] a = {2,4,5,6};
		int[] b = {3,4,8,10,14};

		int[] mergedArray = mergeArray(a, b);
		
		//Expected output {2,3,4,4,5,6,8,10,14}
		
		StringBuilder str = new StringBuilder();
		str.append("{");
		for(int i = 0 ; i < mergedArray.length; i++){
		
			if(i>0) {
				str.append(",");
			}
			str.append( mergedArray[i]);
			
		}
		str.append("}");
		System.out.println(str.toString());

	}
	
  private static int[] mergeArray(int[] a, int[] b){
		
		return null;
		
		//Implement the logic to written Merged Array
		
	}

}

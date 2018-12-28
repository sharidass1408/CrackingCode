package com.merging2arrays;

public class MergingSortedArrays {

	public static void main(String[] args) {
		
		int[] a = {2,4,5,6,9};
		int[] b = {3,4,8,10};

		int[] mergedArray = mergeArray(a, b);
		
		for(int i = 0 ; i < mergedArray.length; i++){
		
			System.out.println( mergedArray[i]);
			
		}

	}
	
private static int[] mergeArray(int[] a, int[] b){
		
		int arraySize = a.length + b.length;
		
		int[] mergedArray = new int[arraySize];
		
		
		int aCount = a.length -1;
		int bCount = b.length -1;
		int index = arraySize-1;
					
		while(aCount > -1 && bCount > -1){
		
			if(b[bCount] > a[aCount]){
			
				mergedArray[index] = b[bCount];
				bCount--;
				index--;
			}
			  
			else{
			
				mergedArray[index] = a[aCount];
				aCount--;
				index--;
			}
					
		
		}
		
		if(aCount > -1){
		
			while(aCount > -1){
				mergedArray[index] = a[aCount];
				aCount--;
				index--;
			}
		
		} else {
		
			while(bCount > -1){
				mergedArray[index] = b[bCount];
				bCount--;
				index--;
			}
		}
			
	
		return mergedArray;
	}

}

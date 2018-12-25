package com.arrays;

public class SecondLargestElement {

public static void main(String[] args){
		
		int[] array = {3,4,7,10,4,9,15};
		
		System.out.println("Second largest element is: " + getSecondLargestElement(array));
		
	}
	
	public static int getSecondLargestElement(int[] array){
		
		int largest = array[0];
		int seclargest = array[0];
		
		for(int i = 1; i <= array.length -1; i++){
			
			if(largest < array[i]){
				
				seclargest = largest;
				largest = array[i];
				
			} else{
				
				if(seclargest< array[i])
					seclargest = array[i];
				
			}
							
		}
		
		return seclargest;
		
	}

}

package com.chapter11;

public class ArrayInsert_Pg360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 4;
		
		int[] b = new int[2];
		b[0] = 3;
		b[1] = 5;
		
		System.out.println("Before Unification values of array a");
		for(int x: a) {
			System.out.println(x);
		}
		
		if(unifyArrays(a,b)) {
				
			System.out.println("After Unification values of array a");
			
			for(int x: a) {
				System.out.println(x);
			}
			
		} else {
			System.out.println(" Failed to Unify");
		}
	
	}

	private static boolean unifyArrays(int[] a, int[] b) {
		int aLastIndex = getLastIndex(a);
		int bLastIndex = getLastIndex(b);
		
		if(aLastIndex == -1 || bLastIndex == -1) {
			return false;
		}else {
			//int mergedLastIndex = a.length -1; //this will leave gaps
			
			int mergedLastIndex = aLastIndex + bLastIndex + 1;
			
			//To insert elements from both a and b from their last locations
			while(aLastIndex>=0 && bLastIndex>=0) {
				if(a[aLastIndex] > b[bLastIndex]) {
					a[mergedLastIndex] = a[aLastIndex];
					mergedLastIndex--;
					aLastIndex--;
				}else {
					a[mergedLastIndex] = b[aLastIndex];
					mergedLastIndex--;
					bLastIndex--;
				}
			}
			
			//To insert remaining elements from b into Merged Index.
			while(bLastIndex > 0) {
				a[mergedLastIndex] = b[bLastIndex];
				mergedLastIndex--;
				bLastIndex--;
			}
			return true;
		}
		
	}

	//Since this is a sorted array we return when element in higher idex has lower value than it previous
	private static int getLastIndex(int[] array) {
		// TODO Auto-generated method stub
		for(int i=1; i<= array.length-1; i++ ) {
			
			if(array[i-1] > array[i]) 
			{
				if(array[i] == 0)
					return i-1;
				else
					return -1;

			}		
				
		}
		return array.length-1;
	}

	

}

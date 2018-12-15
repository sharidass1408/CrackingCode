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
		
		unifyArrays(a,b);
		
		System.out.println("After Unification values of array a");
		
		for(int x: a) {
			System.out.println(x);
		}
	
	}

	private static void unifyArrays(int[] a, int[] b) {
		int aLastIndex = getLastIndex(a);
		int bLastIndex = getLastIndex(b);
		
		if(aLastIndex > -1 || bLastIndex > -1) {
			return;
		}else {
			
		}
		
	}

	//Since this is a sorted array we return when element in higher idex has lower value than it previous
	private static int getLastIndex(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0; i<= a.length-1; i++ ) {
			
			if(a[i] > a[i+1])
				return i;
		}
		return -1;
	}

	

}

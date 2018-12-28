package com.chapter9.staircase;

public class StairCase {

	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		 int count = countWays(25);
		long endTime = System.currentTimeMillis();
		double timeElapsed = (endTime - startTime);
		System.out.println("Time lapsed :" + timeElapsed );
		System.out.println("Count : " + count);

	}

	public static int countWays(int n){

		if(n < 0){
			return 0;
		} 

		if(n == 1){

			return 1;
		}

		return countWays(n-1) + 
			   countWays(n-2) + 
			   countWays(n-3);

	}

}

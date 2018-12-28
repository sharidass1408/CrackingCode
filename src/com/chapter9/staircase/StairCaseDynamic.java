package com.chapter9.staircase;

public class StairCaseDynamic {
	
	public static void main(String[] args){
		
		long startTime = System.currentTimeMillis();
		
		int[] map = new int[Integer.MAX_VALUE - 10000];
		 countWays(25, map);
		long endTime = System.currentTimeMillis();
		
		double timeElapsed = (endTime - startTime);
		
		System.out.println("Time lapsed :" + timeElapsed );

	}

	private static int countWays(int n, int[] map) {
		
		if (n < 0) {
			
			return 0;
			
		} else if (n == 0) {
			
			return 1;
			
		} else if (map[n] > -1) {
			
			return  map[n];
			
		} else {
			map[n] = countWays(n-1, map) 
					+ countWays(n-2, map) 
					+ countWays(n - 3, map);
			
			return map[n];
			
		}
			
	}
	

}

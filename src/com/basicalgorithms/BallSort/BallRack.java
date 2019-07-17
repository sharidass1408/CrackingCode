package com.basicalgorithms.BallSort;

import java.util.Set;
import java.util.TreeSet;

public class BallRack {
	
	Set<Integer> nset = new TreeSet<>((a, b) -> b-a);
	
	public void addBall(int ball) {
		if(ball > 60 || ball < 1) {
			throw new IllegalArgumentException();
		}
		
		if(!nset.add(ball)) {
			throw new ArrayStoreException();		
		}
		
	}
	
	public int[] getBalls() {
		int [] result = new int[nset.size()];
		int index = 0;
		for(int value: nset) {
			result[index] = value;
			index++;
		}
		return result;
	}
}
package com.chapter3.pg202;

public class ThreeStacksInSingleArray {
	
	int stackSize = 2;
	int numOfStacks = 3;
	int[] buffer = new int[stackSize * numOfStacks];
	int[] stackPointers = {-1,-1,-1}; // index represents each stack

	
	public void push(int stackToPushTo, int value) throws Exception{

		if(stackPointers[stackToPushTo] < stackSize -1) { //Care full with the boundaries
			
			int absPosition = getAbsoluteStackTopPosition(stackToPushTo);
			
			buffer[absPosition +1] = value;
			
			stackPointers[stackToPushTo]++;
			
		} else {
			
			throw new Exception("Stack full");
			
		}
		
	}

	
	public int pop(int stackToPopFrom) throws Exception{
		
		int result = -1;
		
		if(stackPointers[stackToPopFrom] >= 0) { //Carefull with boundary condition
			
			int absPosition = getAbsoluteStackTopPosition(stackToPopFrom);
			
			result = buffer[absPosition];
			
			stackPointers[stackToPopFrom]--;
			
		} else {
			
			throw new Exception("Stack is empty");
			
		}
		
		return result;
	}
	
	
	private int getAbsoluteStackTopPosition(int stackIndex) {
		
		return stackIndex * stackSize  + stackPointers[stackIndex];
		
	}

	

}

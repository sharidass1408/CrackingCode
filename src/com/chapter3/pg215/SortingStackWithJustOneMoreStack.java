package com.chapter3.pg215;

import java.util.Stack;

public class SortingStackWithJustOneMoreStack<T> {
	

	public static Stack<Integer> sortStack(Stack<Integer> originalStack){
		
		Stack<Integer> sortedStack = new Stack<>();
		
		while( !originalStack.isEmpty()) {
			int temp = originalStack.pop();
			
			
			while(!sortedStack.empty() && sortedStack.peek() > temp) {
				originalStack.push(sortedStack.pop());
			}
			
			/*We get to the below line only when sortedStack is empty 
			       or
			if sorted stack hold value less temp */
			sortedStack.push(temp);
		}

		return sortedStack;
	}
}

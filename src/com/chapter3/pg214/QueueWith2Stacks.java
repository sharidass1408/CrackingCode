package com.chapter3.pg214;

import java.util.Stack;

public class QueueWith2Stacks<T> {

	Stack<T> newElementsStack;
	Stack<T> oldElementsStack;
	
	public QueueWith2Stacks() {
		newElementsStack = new Stack<>();
		oldElementsStack = new Stack<>();
	}
	
	public void add(T object) {
		
		newElementsStack.push(object);

	}
	
	//Check if elements are avialble in old Stack
	// shuffle if need and pop from oldStack
	public T remove() {
		
		if(oldElementsStack.peek() == null) {
			shuffleStacks();
		}
		return oldElementsStack.pop();
	}
	
	
	public T peek(T object) {
		
		if(oldElementsStack.peek() == null) {
			shuffleStacks();
		}
		return oldElementsStack.peek();
	}
	
	
	// Main logic is to do a shuffle only when oldElementsStack is Empty
	public void shuffleStacks() {
		
		if(oldElementsStack.isEmpty()) {
			while (newElementsStack.peek() != null) {
				oldElementsStack.push((newElementsStack.pop()));
			}
		}
	}
	
	public int size() {
		return oldElementsStack.size() + newElementsStack.size();
	}

}

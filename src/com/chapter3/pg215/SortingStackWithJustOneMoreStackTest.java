package com.chapter3.pg215;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.collection.IsIterableContainingInOrder;

public class SortingStackWithJustOneMoreStackTest {

	@Test
	public void sort_4Integers_Sorted4Integers() {
		
		Stack<Integer> originalStack = new Stack<>();
		
		originalStack.push(2);
		originalStack.push(1);
		originalStack.push(3);
		originalStack.push(4);
		
		Stack<Integer> expectedStack = new Stack<>();
		
		expectedStack.push(1);
		expectedStack.push(2);
		expectedStack.push(3);
		expectedStack.push(4);
		
		Stack<Integer> sortedStack = SortingStackWithJustOneMoreStack.sortStack(originalStack);
		
		Assert.assertArrayEquals(expectedStack.toArray(), sortedStack.toArray());
		
	}
	
}

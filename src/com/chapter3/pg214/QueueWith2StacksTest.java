package com.chapter3.pg214;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class QueueWith2StacksTest {
	
	

	@Test
	void add_EmptyQueue_SizeIncreaseBy1() {

		QueueWith2Stacks<String> queue = new QueueWith2Stacks<>();
		queue.add("a");
		
		Assert.assertEquals(1,queue.size());
	}
	
	@Before
	void add4ElementstoQueue() {
		QueueWith2Stacks<String> queue = new QueueWith2Stacks<>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
	}
	
	@Test
	void pop_QueueWith4Element_PopFirstElement() {
		
		QueueWith2Stacks<String> queue = new QueueWith2Stacks<>();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		
		Assert.assertEquals("a", queue.remove());
	}
	
	
}

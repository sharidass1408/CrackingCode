package com.linkedlist;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LinkedListFindindingCiruclarTest {

	@Test
	public void isLoopPresent_withOutLoop_returnsFlase() {
		
		LinkedListFindindingCiruclar linkedList = new LinkedListFindindingCiruclar();
		Node node1 = new Node(null,1);
		Node node2 = new Node(null,2);
		Node node3 = new Node(null,3);
		Node node4 = new Node(null,2);
	
		linkedList.addNode(node1);
		linkedList.addNode(node2);
		linkedList.addNode(node3);
		linkedList.addNode(node4); //Circular list
		
		Assert.assertFalse(linkedList.isLoopPresent());
	}
	
	@Test
	public void isLoopPresent_withLoop_returnsTrue() {
		
		LinkedListFindindingCiruclar linkedList = new LinkedListFindindingCiruclar();
		Node node1 = new Node(null,1);
		Node node2 = new Node(null,2);
		Node node3 = new Node(null,3);
		Node node4 = new Node(node3,2);
	
		linkedList.addNode(node1);
		linkedList.addNode(node2);
		linkedList.addNode(node3);
		linkedList.addNode(node4); //Circular list
		
		Assert.assertTrue(linkedList.isLoopPresent());
	}
	
	

}

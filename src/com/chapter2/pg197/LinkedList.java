package com.chapter2.pg197;

public class LinkedList {
	
	public Node root;
	private Node tail;

	public void add(Node node) {
		
		if(root == null) {
			root = node; // for first element
		}
		else {
			tail.next = node; // for third and beyond
		}
		tail = node;
		
	}
	
}

package com.linkedlist;

public class LinkedListFindindingCiruclar {
	
	public Node root;
	
	public void addNode(Node newNode) {
		
		if(this.root == null) {
			root = newNode;
		} else {
			Node node = this.root;
			while( node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
		
	}
	
	public static boolean isLoopPresent(LinkedListFindindingCiruclar linkedList){
		
		if(linkedList.root == null || 
				(linkedList.root != null && linkedList.root.next == null)) {
			return false; // for 0 or one element
		}
		
		//Both start at one step apart from each other
		Node nextNode = linkedList.root;
		Node nextNextNode = linkedList.root.next;
		
		do {
			if(nextNode.equals(nextNextNode)) {
				return true; 
			}
			nextNode = nextNode.next; //  jump one
			nextNextNode = nextNextNode.next.next; // jump two
			
		}while(nextNextNode.next != null && nextNextNode.next.next != null);
		
		return false;
	}
	

}

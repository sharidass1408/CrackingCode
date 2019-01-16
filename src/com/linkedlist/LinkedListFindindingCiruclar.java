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
		
		//Both start at the same location
		Node nextNode = linkedList.root.next;
		Node nextNextNode = nextNode;
		
		do {
			if(nextNode.equals(nextNextNode)) {
				return false;
			}
			nextNode = nextNode.next; //  jump one
			nextNextNode = nextNextNode.next.next; // jump two
			
		}while(nextNode != null);
		
		return true;
	}
	

}

package com.chapter2.pg194;

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
	
	public boolean isLoopPresent(){
		
		if(this.root == null || 
				(this.root != null && this.root.next == null)) {
			return false; // for 0 or one element
		}
		
		//Both start at one step apart from each other
		Node nextNode = this.root;
		Node nextNextNode = this.root.next;
		
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

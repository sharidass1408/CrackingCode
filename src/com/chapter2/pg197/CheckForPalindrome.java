package com.chapter2.pg197;

import java.util.Stack;

//Using a stack when the size of the LinkeList is not known
public class CheckForPalindrome {
	
	
	
	public static boolean isPalindrome(LinkedList linkedList) {
		
		//For no elements return false
		if(linkedList == null || linkedList.root == null) {
			return false;
		}
		
		//For single element return true
		if(linkedList.root.next == null) {
			return true;
		}
		
		Stack<Node> stack = new Stack<>();
		
		Node slow = linkedList.root;
		Node fast = linkedList.root;
		
		while(fast != null && fast.next != null) {
			stack.push(slow);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//for odd numbers one element stay in the linked list and we should
		//move on the next skipping the middel
		// we came out of the above loop becuase of fast.next being null
		if(fast != null) {
			slow = slow.next;
		}
		
		// now pop the elements from the stack and compare with
		// elements in linkedlist
		while(slow != null) {
			
			int valueInStack = stack.pop().data;
			int valueInList = slow.data;
			
			if(valueInStack != valueInList)
				return false;
		}
		
		return true;
	}

}

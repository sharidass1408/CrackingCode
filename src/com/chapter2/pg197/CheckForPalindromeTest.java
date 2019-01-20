package com.chapter2.pg197;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class CheckForPalindromeTest {

	@Test
	public void isPalindrome_withEvenNumberofPalindromeElements_returnsTrue() {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add( new Node(1));
		linkedList.add( new Node(2));
		linkedList.add( new Node(3));
		linkedList.add( new Node(3));
		linkedList.add( new Node(2));
		linkedList.add( new Node(1));
		
		Assert.assertTrue(CheckForPalindrome.isPalindrome(linkedList));
	}
	
	@Test
	public void isPalindrome_withOddNumberofPalindromeElements_returnsTrue() {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add( new Node(1));
		linkedList.add( new Node(2));
		linkedList.add( new Node(3));
		linkedList.add( new Node(2));
		linkedList.add( new Node(1));
		
		Assert.assertTrue(CheckForPalindrome.isPalindrome(linkedList));
	}
	
	
}

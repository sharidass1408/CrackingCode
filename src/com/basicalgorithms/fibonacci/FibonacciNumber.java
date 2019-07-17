package com.basicalgorithms.fibonacci;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {

		System.out.println("Please enter a valid number: ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		sc.close();
		
		System.out.println("Fibonacci value for the number is: " + fibonacci(value));
		
	}

	private static int fibonacci(int n) {
		
		if(n <= 1)
			return n;
		else
			return fibonacci(n-2) + fibonacci(n-1);
		
	}

}

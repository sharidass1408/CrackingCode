package com.basicalgorithms.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number to perform fibonnoci");
		Scanner reader = new Scanner(System.in);
		int value = reader.nextInt();
		reader.close();
		
		System.out.println("Fibonacci series for the entered number is: ");
		fibonacci(value);
	}

	private static int fibonacci(int n) {


		
		
	}

}

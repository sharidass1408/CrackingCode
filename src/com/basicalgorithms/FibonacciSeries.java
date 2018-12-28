package com.basicalgorithms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number to perform fibonnoci");
		Scanner reader = new Scanner(System.in);
		int value = reader.nextInt();
		
		System.out.println("Fibonacci series for the entered number is: ");
		fibonacci(value);
	}

	private static int fibonacci(int n) {

		int number = 0;
		
		if(n == 0) {
			
			number = 0;
			
		} else if (n == 1) {
			
			number = 1;
			
		} else {
			
			number =  fibonacci(n -2) + fibonacci(n -1);
			
		}
		
		System.out.println(number);
		return number;
		
	}

}

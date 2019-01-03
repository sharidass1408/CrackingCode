package com.arrays;

import java.util.Scanner;

/**
 * 
 * @author Sai
 *Write code to partition an array by index Eg 
 *given {6,7,3,5,2,1,8} and an index 4? Ur array 
 *should be patitioned such that all elements less 
 *then 2 are to left of 2 and elements greater for 
 *than 2 are to the right of 2 (asince 2 is the number
 * at index 4) sample output {1,2,8,7,5,6,3}
 *
 */

public class ArrayPartitioning {

	public static void main(String[] args) {
		int[] array = {6,7,3,5,2,1,8,9};
		
		System.out.println("Before partitioning: ");		
		printArray(array);
		
		System.out.println("Please enter pivot: ");	
		Scanner sc = new Scanner(System.in);
		int pivot = sc.nextInt();
		
		partition(array, pivot);
		
		System.out.println("After partitioning: ");		
		printArray(array);
	}

	private static void partition(int[] array, int pivot) {

		//find the pivot Index
		int pivotIndex = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == pivot)
				pivotIndex = i;
		}
		
		//place the pivot at 0th element		
		swap(0, pivotIndex, array);
		
		
		//Partition all the elements except the pivot at location zero
		int i = 1;
		int j = 1;
		
		for( ; j < array.length; j++) {
			
			if(array[j] < pivot) {
				swap(i,j,array);
				i++;
			}
			
		}
		
		//Place back the pivot at zeroth location to i-1 location
		
		int temp = array[i-1];
		array[i-1] = pivot;		
		array[0] = temp;
		
	}

	private static void swap(int left, int right, int[] array) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	private static void printArray(int[] array) {
		
		for(int element: array) {
			System.out.println(element);
		}
		
	}

}

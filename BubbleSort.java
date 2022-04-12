package com.practice.demo.novare;

public class BubbleSort {

	public static void main(String[] args) {

	//Input
	int input[] = {1, 10, 5, -13, 20, 2};	

	display (input);
	
	//Implementation
	int counter = bubbleSort(input);
	display (input);
	System.out.println("Number of Iterations = " + counter);
	}

	
	//Functions
	public static void swap(int[] array, int i) {
		int temp = array[i];
		array[i] = array[i+1];
		array[i+1] = temp;
	}
	
	public static void display(int[] array) {
		for (int i=0; array.length>i; ++i) {
		System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}	
	
	public static int bubbleSort(int[] array) {
		boolean reset = true;
		int counter = 0;
		while (reset == true) {
			reset = false;
			counter +=1;
			int size = array.length;
			//size-1 to eliminate index out of bounds error
			for(int i=0; size-1>i; ++i) {
				if (array[i]>array[i+1]) {
						swap(array, i);
						reset = true;
					}
			}
		}
		return counter;
	}
	
}

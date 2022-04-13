package com.practice.demo.novare;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaximum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> inputs = new ArrayList<Integer>();
		System.out.println("Enter Number of Elements: ");
		int numberOfElements = sc.nextInt();
		System.out.println("Enter Elements:");
		while (numberOfElements > 0) {
			inputs.add(sc.nextInt());
			--numberOfElements;
		}
		sc.close();
		
		System.out.println("Maximum Value: " + findMaximum(inputs));
		
		

	}
	
	public static int findMaximum (ArrayList<Integer> input) {
		
		int size = input.size();
		int largest = input.get(0);
		for(int i=0; size-1 > i; ++i) {
			if (largest < input.get(i+1))largest = input.get(i+1);
		}
		//condition for size 1 array
		if (size == 1) largest = input.get(0);
		return largest;
	}

}

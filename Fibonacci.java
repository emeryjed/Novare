package com.practice.demo.novare;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int input = 3;		
		System.out.println(fibonacci (input));

	}
	
	public static int fibonacci (int input) {
		
		
		if (input == 0) return 0;
		else if (input == 1) return 1;
		int number = 1;
		int previous = 0;
		int sum = 0;
			for (int i = 1; input > i; ++i) {
				sum = previous + number;
				previous = number;
				number = sum;
			}

		return sum;
	}

}

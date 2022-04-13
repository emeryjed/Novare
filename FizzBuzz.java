package com.practice.demo.novare;

public class FizzBuzz {

	public static void main(String[] args) {

		int input = 30;
		System.out.println(fizzBuzz(input));

	}
	
	public static String fizzBuzz (int input) {
		
		if (input == 0) return Integer.toString(0);
		else if (input%3 == 0  && input%5 == 0) return "FizzBuzz";
		else if (input%3 == 0) return "Fizz";
		else if (input%5 == 0) return "Buzz";
		else return Integer.toString(input);
	}

}

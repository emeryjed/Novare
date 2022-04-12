package com.practice.demo.novare;

public class Palindrome {

	public static void main(String[] args) {
		
		String input = "12321";
		String input2 = "Laptop";
		String input3 = "Madam";
		System.out.println(palindromeChecker(input));
		System.out.println(palindromeChecker(input2));
		System.out.println(palindromeChecker(input3));
		
	}
	
	public static String palindromeChecker(String input) {
		
		//created inputCompare to accept any case of letters
		String inputCompare = input.toLowerCase();
		int size = inputCompare.length();
		String reverseString = "";
		for (int i = size - 1; i >= 0; --i) {
			reverseString+=inputCompare.charAt(i);
		}
		if (inputCompare.equals(reverseString)) return input + " is a Palindrome";
		else return input + " is not a Palindrome";

	}

}

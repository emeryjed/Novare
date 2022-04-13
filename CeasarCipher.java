package com.practice.demo.novare;

import java.util.ArrayList;

public class CeasarCipher {

	public static void main(String[] args) {

		String input = "abc";
		String input2 = "xyz";
		System.out.println(ceasarCipher(input, 5));
		System.out.println(ceasarCipher(input2, 52));

	}
	
	public static class AlphabetMapping{
		
		ArrayList<String> alphabetMapping = new ArrayList<String>();	
		
		public String returnLetter(char letter,int notation) {
			
			int alphabetOrder = 0;
			
			alphabetMapping.add("a");
			alphabetMapping.add("b");
			alphabetMapping.add("c");
			alphabetMapping.add("d");
			alphabetMapping.add("e");
			alphabetMapping.add("f");
			alphabetMapping.add("g");
			alphabetMapping.add("h");
			alphabetMapping.add("i");
			alphabetMapping.add("j");
			alphabetMapping.add("k");
			alphabetMapping.add("l");
			alphabetMapping.add("m");
			alphabetMapping.add("n");
			alphabetMapping.add("o");
			alphabetMapping.add("p");
			alphabetMapping.add("q");
			alphabetMapping.add("r");
			alphabetMapping.add("s");
			alphabetMapping.add("t");
			alphabetMapping.add("u");
			alphabetMapping.add("v");
			alphabetMapping.add("w");
			alphabetMapping.add("x");
			alphabetMapping.add("y");
			alphabetMapping.add("z");

			if(letter == 'a') alphabetOrder = 0;      
			else if(letter == 'b') alphabetOrder = 1;
			else if(letter == 'c') alphabetOrder = 2;
			else if(letter == 'd') alphabetOrder = 3;
			else if(letter == 'e') alphabetOrder = 4;
			else if(letter == 'f') alphabetOrder = 5;
			else if(letter == 'g') alphabetOrder = 6;
			else if(letter == 'h') alphabetOrder = 7;
			else if(letter == 'i') alphabetOrder = 8;
			else if(letter == 'j') alphabetOrder = 9;
			else if(letter == 'k') alphabetOrder = 10;
			else if(letter == 'l') alphabetOrder = 11;
			else if(letter == 'm') alphabetOrder = 12;
			else if(letter == 'n') alphabetOrder = 13;
			else if(letter == 'o') alphabetOrder = 14;
			else if(letter == 'p') alphabetOrder = 15;
			else if(letter == 'q') alphabetOrder = 16;
			else if(letter == 'r') alphabetOrder = 17;
			else if(letter == 's') alphabetOrder = 18;
			else if(letter == 't') alphabetOrder = 19;
			else if(letter == 'u') alphabetOrder = 20;
			else if(letter == 'v') alphabetOrder = 21;
			else if(letter == 'w') alphabetOrder = 22;
			else if(letter == 'x') alphabetOrder = 23;
			else if(letter == 'y') alphabetOrder = 24;
			else if(letter == 'z') alphabetOrder = 25;
			
			if (alphabetOrder+notation > 25) {
				alphabetOrder = (alphabetOrder+notation);
				while (alphabetOrder > 25) alphabetOrder = alphabetOrder - 26; 
				return alphabetMapping.get(alphabetOrder);
				}
			
			return alphabetMapping.get(alphabetOrder + notation);
		}

	}
	
	public static String ceasarCipher(String input, int notation) {
		
		int size = input.length();
		String cipheredString = "";
		AlphabetMapping letter = new AlphabetMapping();
		for (int i=0; size > i; ++i) {
			cipheredString+=letter.returnLetter(input.charAt(i), notation);
		}
		
		return cipheredString;
	}

}

package com.practice;

public class vowels {
	    public static void main(String[] args) {
	        System.out.println(countVowels("Hello World")); // prints 3
	        System.out.println(countVowels("OpenAI")); // prints 4
	    }

	    public static int countVowels(String s) {
	        int count = 0;
	        for (char c : s.toCharArray()) {
	            if ("AEIOUaeiou".indexOf(c) != -1) {
	                count++;
	            }
	        }
	        return count;
	    }
	}

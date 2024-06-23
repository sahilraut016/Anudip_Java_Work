package com.practice;
	public class Reverse {
	    public static void main(String[] args) {
	        System.out.println(reverseStringUsingStringBuilder("hello")); // prints "olleh"
	        System.out.println(reverseStringUsingStringBuilder("world")); // prints "dlrow"
	    }

	    public static String reverseStringUsingStringBuilder(String s) {
	        return new StringBuilder(s).reverse().toString();
	    }
	}




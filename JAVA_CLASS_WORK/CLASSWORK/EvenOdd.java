package com.practice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.println("The given number is even");
		}
		else {
			System.out.println("the given number is odd");
		}

	}

}

package com.array;

import java.util.Scanner;

//array is a linear data structure which can hold elements of same data type

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialization of array
		int arr[] = new int[5];
		int i;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER FIVE NUMBERS");
		for(i=0;i<5;i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("you have entered  :");
		for(i=0;i<5;i++) 
		{
			System.out.println("arr["+i+"]-"+arr[i]); 	
		}

	}

}

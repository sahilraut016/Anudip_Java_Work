package com.array;

import java.util.Scanner;

//array is a linear data structure which can hold elements of same data type

public class minimumex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialization of array
		int arr[] = new int[5];
		int i, min;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER FIVE NUMBERS");
		for(i=0;i<5;i++) 
		{
			arr[i] = sc.nextInt();
		}
		min = arr[0];
		for(i=0;i<5;i++) 
		{
			if(arr[i]<min) {
			min = arr[i];
			}
		}
		System.out.println("THE MINIMUM ELEMENT IS :"+min);
	}

}

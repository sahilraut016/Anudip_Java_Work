package com.array;

import java.util.Scanner;

public class maximumex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialization of array
		int arr[] = new int[5];
		int i, max;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER FIVE NUMBERS");
		for(i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		for(i=0;i<5;i++) 
		{
		if(arr[i]>max) //maximum 
		{
			max = arr[i];
			}				
		}
		System.out.println("THE MAXIMUM ELEMENT IS :"+max);

	}

}

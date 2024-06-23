package com.array;

import java.util.Scanner;

public class buublesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		int i, j , temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER FIVE NUMBERS");
		for(i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}

}

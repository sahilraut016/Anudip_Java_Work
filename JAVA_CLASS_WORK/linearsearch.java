package com.array;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,len,key,array[];
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER ARRAY LENGTH");
		len = input.nextInt();
		array = new int[len];
		System.out.println("ENTER"  +len+  "ELEMENTS");
		for(i=0;i<len;i++)
		{
			array[i] = input.nextInt();
		}
		System.out.println("ENTER THE SEARCH KEY VALUE:");
		key = input.nextInt();
		for(i=0;i<len;i++)
		{
			if(array[i]==key)
			{
				System.out.println(key+"is present at location"+(i+1));
				break;
			}
		}
		if(i==len)
			System.out.println(key+"doesn't exist in array.");
	}

}

package exceptionexamples;

import java.util.Scanner;

public class IntegerInput {
	public void getinput()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("enter a number");
		a = sc.nextInt();
		System.out.println("the number is :"+a);
		}
		catch (Exception e)
		{
			System.out.println("Enter a integer value");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerInput in = new IntegerInput();
		in.getinput();

	}

}

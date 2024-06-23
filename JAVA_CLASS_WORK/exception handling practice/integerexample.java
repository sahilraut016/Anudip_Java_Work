package exceptionexamples;

import java.util.Scanner;

public class integerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, ans;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the divedend");
			a = sc.nextInt();
			System.out.println("Enter the divisor");
			b = sc.nextInt();
			ans = a / b;
			System.out.println("The Remainder is :" +ans);
		}
		catch (Exception e)
		{
			System.out.println("Number cannot be divided by 0");
		}
		

	}

}

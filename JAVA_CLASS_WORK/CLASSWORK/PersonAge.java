package com.practice;
import java.util.Scanner;

public class PersonAge implements MyMethods { //implementing MyMethods Interface in PersonAge
	
	int Age;
	String Name;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {  //Main class
		// TODO Auto-generated method stub
		PersonAge obj = new PersonAge(); //Creating the object of the class
		obj.printDetails(); //calling the object
	}

	@Override
	public void printDetails() { 
		// TODO Auto-generated method stub
		System.out.println("ENTER YOUR NAME:");
		Name = sc.next(); //Taking Name from the user as String
		System.out.println("ENTER YOUR AGE:");
		Age = sc.nextInt(); // Taking Age from the user as String
		System.out.println("UserDetails:"+Name+  Age);
		
	}

}

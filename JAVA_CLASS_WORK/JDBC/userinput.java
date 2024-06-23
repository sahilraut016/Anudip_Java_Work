package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class userinput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step1
		Class.forName("com.mysql.cj.jdbc.Driver"); 
				
		//step2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptjava","root","root");
				
		//step3
		PreparedStatement pstmt=con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?,?)");
		
		//using scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EMPLOYEE ID:");
		int id=sc.nextInt();
		
		System.out.println("ENTER EMPLOYEE NAME:");
		String name=sc.next();
		
		System.out.println("ENTER EMPLOYEE DESIGNATION:");
		String desig=sc.next();
		
		System.out.println("ENTER EMPLOYEE DEPARTMENT:");
		String dept=sc.next();
		
		System.out.println("ENTER EMPLOYEE SALARY:");
		int sal=sc.nextInt();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, desig);
		pstmt.setString(4, dept);
		pstmt.setInt(5, sal);
		
		
		int r=pstmt.executeUpdate();
		con.close();
		System.out.println(r+"RECORD ADDED SUCESSFULLY!!!!");
		

	}

}

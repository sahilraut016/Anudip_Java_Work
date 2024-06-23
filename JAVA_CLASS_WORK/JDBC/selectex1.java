package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step1
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		//step2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aptjava","root","root");
		
		//step3
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from customer");
		int id, salary;
		String name, design, department;
		System.out.println("Customer details");
		System.out.println("===========================");
		while(rs.next())
		{
			id=rs.getInt(1);
			name=rs.getString(2);
			design=rs.getString(3);
			department=rs.getString(4);
			salary=rs.getInt(5);
			System.out.println(id+"     |     "+name+"     |     "+design+"     |     "+department+"     |     "+salary);
		}
		
		//closing the connection
		con.close();
		
		
		
		

	}

}

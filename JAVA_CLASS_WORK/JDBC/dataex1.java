package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dataex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/aptjava";
		String username = "root";
		String password = "root";
		String query = "insert into stud values(99, 'Malinga')";
		
		//Load driver class
		Class.forName(driverClassName);
		
		//Obtain a connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		//Obtain a statement
		Statement st = con.createStatement();
		
		//Execute the query
		int count = st.executeUpdate(query);
		System.out.println("number of rows affected by this query= "+count);
		
		//Closing the connection as per the requirement with connection is completed
	}

}
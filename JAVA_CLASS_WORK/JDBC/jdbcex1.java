package demo1;
import java.sql.*;
public class jdbcex1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aptjava","root","root");
		
		Statement stmt=con.createStatement();
		
		int a=stmt.executeUpdate("insert into emp values(1,'atharva','computer',10000)");
		System.out.println("sucessfully added employee"+a);
		//int b=stmt.executeUpdate("insert into emp values(2,'yash','it',20000)");
		//System.out.println("sucessfully added employee"+b);
		//int c=stmt.executeUpdate("insert into emp values(3,'shetke','mechanical',30000)");
		//System.out.println("sucessfully added employee"+c);
		//int d=stmt.executeUpdate("insert into emp values(4,'sahil','aids',40000)");
		//System.out.println("sucessfully added employee"+d);
		//int e=stmt.executeUpdate("insert into emp values(5,'sagar','iot',50000)");
		//System.out.println("sucessfully added employee"+e);
		//con.close();
		

	}

}

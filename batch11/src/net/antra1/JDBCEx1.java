package net.antra1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCEx1 {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the id");
		int id=sc.nextInt();
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		Statement stmt=con.createStatement();
		//inserting the data
		//stmt.executeUpdate("insert into employee values(2,'huang',348)");
		//ResultSet rs=stmt.executeQuery("Select * from employee where empid="+id);
		ResultSet rs=stmt.executeQuery("Select * from employee");
		
		ResultSetMetaData rst=rs.getMetaData();
		int no=rst.getColumnCount();
		
		while(rs.next()) {

			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		con.close();
	}
}

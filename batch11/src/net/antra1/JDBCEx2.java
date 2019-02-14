package net.antra1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCEx2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the id");
		int id=sc.nextInt();
		System.out.println("please enter the name:");
		String name=sc.next();
		System.out.println("please enter the sal:");
		int sal=sc.nextInt();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, sal);
		
		pstmt.executeUpdate();
		con.close();
	}
}

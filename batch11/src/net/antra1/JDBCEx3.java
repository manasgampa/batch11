package net.antra1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx3 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		/*CallableStatement cstmt=con.prepareCall("{call myproc}");
		cstmt.execute();*/
		con.setAutoCommit(false);
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
		pstmt.setInt(1, 6);
		pstmt.setString(2, "Bob");
		pstmt.setInt(3, 463);
		
		pstmt.addBatch();
		
		pstmt.setInt(1, 4);
		pstmt.setString(2, "David");
		pstmt.setInt(3, 984);
		
		pstmt.addBatch();
		
		pstmt.executeBatch();
		
		con.close();
		
	}

}

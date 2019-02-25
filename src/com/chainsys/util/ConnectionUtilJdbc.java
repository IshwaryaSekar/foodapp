package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtilJdbc {
	public  static Connection getConnection()
	{		Connection connection=null;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.Get connection
			String url="jdbc:oracle:thin:@localhost:1521:XE";
		 connection=DriverManager.getConnection(url,"hr","hr");
			//System.out.println(connection);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs)
	{try
	{
		if(rs!=null)
		{rs.close();
	}
		if(pstmt!=null)
		{pstmt.close();
	}
		if(conn!=null)
		{conn.close();
	}
	}
	catch(SQLException e)
	{
	}
	}


}

package oracleSample;

import java.sql.*;

public class ConnectionWithOracle {
public static void main(String args[])
{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "alok", "Alokkumar");
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		con.close();
		System.out.println(con.isClosed());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

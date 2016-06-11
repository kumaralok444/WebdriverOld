package oracleSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRec {
	public static void main(String args[])
	{
	
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "alok", "Alokkumar");
			Statement stmt=con.createStatement();
			String sql="insert into employee values(101,'Alok',10000)";
			stmt.executeUpdate(sql);
		    sql="insert into employee values(102,'Vishwa',10000)";
			stmt.executeUpdate(sql);
			con.close();
		}
		catch(Exception e)
		{
			
		}
	}

}

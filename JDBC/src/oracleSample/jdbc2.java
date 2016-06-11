package oracleSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc2 {
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
		}
		catch(Exception e)
		{
			
		}
	}

}

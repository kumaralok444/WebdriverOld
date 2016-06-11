package jdbc;
import java.sql.*; 
import java.util.Properties;
class OracleCon{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","alok","Alokkumar");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query 
String sql ="select * from student";
PreparedStatement preStatement = con.prepareStatement(sql);
ResultSet rs = preStatement.executeQuery();

while(rs.next())  
System.out.println(rs.getString(1));  
  
//step5 close the connection object  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  
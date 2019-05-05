import java.sql.*;
class Program3
{
	public static void main(String k[]) throws Exception
	{
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:oci:@xe","system","amit");
		 //con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","amit");
		 if(con!=null)
			 System.out.println("connection established");
		 else
			 System.out.println("not established");
		
	}
}
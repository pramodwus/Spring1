import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
class Program5
{
	public static void main(String args[]) throws Exception
	{
		Connection con=null;
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		if(con!=null)
		{
		Statement stmt=con.createStatement();
		String sql="insert into loan values(1004,'car',100000)";
	 	int i=stmt.executeUpdate(sql);
	       if(i>0) 	
			   System.out.println(i+" row inserted");
		   else
			   System.out.println(i+" row inserted");
		   
	
		stmt.close();
		con.close();
		}
		else
		{
			System.out.println("connection not estalished");
		}
	}
}
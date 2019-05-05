//Curd.java
//driver:type-4(connector/j)
//database:mysql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
class Curd
{
	public static void main(String k[])throws Exception
	{
		//we no need to load driver class explicitly. it is automatically loaded.
		//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		System.out.println("connection is opened");
		Statement stmt=con.createStatement();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a command");
		String cmd=s.nextLine();
		boolean flag=stmt.execute(cmd);
		if(flag==true)
		{
			ResultSet rs=stmt.getResultSet();
			while(rs.next())
			{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
				
			}
			rs.close();
			
		}
		else
		{
			int i=stmt.getUpdateCount();
			System.out.println(i+"row effected");
			
		}
		stmt.close();
		con.close();
	}
	
	
}

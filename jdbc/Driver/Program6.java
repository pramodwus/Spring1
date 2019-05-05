//program6.java
//create student table and insert a record
//driver: type-4
//database:oracle/MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class Program6
{
	public static void main(String args[])
	{
		Connection con=null;
		Statement stmt=null;
		try
		{
		//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		System.out.println("connection is opened");
        stmt=con.createStatement();
        stmt.executeUpdate("create table student(sid number(5) primary key,sname varchar2(15),marks number(6))");
        System.out.println("table created");
		int i=stmt.executeUpdate("insert into student values (101,'amit',500)");
		System.out.println(i+" row inserted");
                                                                                                                                                                                                                                                                                                                                          	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				stmt.close();
				con.close();
				System.out.println("connection is closed");
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
		}
		
	}
	
}



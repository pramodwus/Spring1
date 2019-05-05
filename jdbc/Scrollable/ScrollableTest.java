//ScrollableTest.java
//driver: type-4(oracle thin driver)
//database:oracle 11g
//read data from scrollable resultset
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
class ScrollableTest
{
	public static void main(String args[]) throws Exception
	{
		//driver is automatically loaded
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=stmt.executeQuery("select * from emp");
		//move the cursor  to after last row
		rs.afterLast();
		//move the cursor in backword direction
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			
			
		}
		System.out.println("==========================================================");
		//move cursor into 3rd row and print them
		rs.absolute(3);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		//find out cursor position
		int i=rs.getRow();
		System.out.println("cursor position is :"+i);
		rs.close();
		con.close();
		stmt.close();
		
		
		
		
		
		
		
	}
	
}

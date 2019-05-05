//UpdatableTest.java
//driver: type-4(oracle thin driver)
//database:oracle 11g
//Updatable resultSet program
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
class UpdatableTest
{
	public static void main(String args[])throws Exception
	{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select empno,ename,sal,hiredate  from emp");
		//insert opration
		rs.moveToInsertRow();
		rs.updateInt(1,7912);
		rs.updateString(2,"BOND");
		rs.updateInt(3,3600);
		//rs.updateString(4,"20-jan-99"); not support here
		rs.insertRow();
		System.out.println("row inserted");
		//delete operation
		rs.absolute(3);
		rs.deleteRow();
		System.out.println("row deleted");
		rs.close();
		stmt.close();
		con.close();
	}
	
}
 

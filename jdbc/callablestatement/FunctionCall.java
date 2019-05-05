//FunctionCall.java
//driver: type-4(oracle thin driver)
//database:oracle 11g
//call function emp_bonus
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Types;
class FunctionCall
{
	public static void main(String args[]) throws Exception
	{
		//driver is automatically loaded
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		CallableStatement cstmt=con.prepareCall("{?=call emp_bonus(?)}");
	    cstmt.registerOutParameter(1,Types.DOUBLE);
		cstmt.setInt(2,7788);
		cstmt.execute();
		double d=cstmt.getDouble(1);
		System.out.println("bonus=:"+d);
		cstmt.close();
		con.close();
		
		
		
	}
	
}

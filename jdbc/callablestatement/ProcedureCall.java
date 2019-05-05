//ProcedureCall.java
//driver: type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Types;
class ProcedureCall
{
	public static void main(String args[])throws Exception
	{
		//driver is automatically loaded
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		CallableStatement cstmt=con.prepareCall("{call exp_pro(?,?,?)}");
		//set value for in parameter
		cstmt.setInt(1,7788);
		//register out parameters
		cstmt.registerOutParameter(2,Types.VARCHAR);
		cstmt.registerOutParameter(3,Types.INTEGER);
		//execute
		cstmt.execute();
		//read output from cstmt
        String s1=cstmt.getString(2);
		int k=cstmt.getInt(3);
		System.out.println("Ename :"+s1);
		System.out.println("Experience :"+k+" Years");
		cstmt.close();
		con.close();
	}
}

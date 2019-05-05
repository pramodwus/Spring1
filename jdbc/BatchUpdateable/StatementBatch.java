//StatementBatch.java
//batch processing
//driver:type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class StatementBatch
{
	public static void main(String k[])throws Exception
	{
		//driver is automatically loaded
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		Statement stmt=con.createStatement();
		stmt.addBatch("insert into sathya values(102,'abhay',300)");
		stmt.addBatch("delete from student");
		stmt.addBatch("update emp set sal=7777 where empno=7788");
		int i[]=stmt.executeBatch();
		System.out.println("Batch completed");
		stmt.close();
		con.close();
		
		
		
	}
}

//PreparedtBatch.java
//batch processing
//driver:type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class PreparedBatch
{
	public static void main(String k[])throws Exception
	{
		//driver is automatically loaded
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amit");
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
		 pstmt.setInt(1,101);
		pstmt.setString(2,"amit");
		pstmt.setInt(3,400);
		pstmt.addBatch();
       
    	pstmt.setInt(1,102);
		pstmt.setString(2,"anil");
		pstmt.setInt(3,500);
		pstmt.addBatch();
        
		int i[]=pstmt.executeBatch();
		System.out.println("batch completed");
		pstmt.close();
		con.close();



     }
}
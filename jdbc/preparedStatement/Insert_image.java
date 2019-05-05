//Insert_image.java
//insert image into emps_image table
//using preparedStatement
//driver: type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
class Insert_image
{
	public static void main(String args[]) throws Exception
	{
		//driver is automatically loaded
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		PreparedStatement pstmt=con.prepareStatement("insert into emps_image values(?,?,?,?)");
		pstmt.setInt(1,111);
		pstmt.setString(2,"sunder");
		pstmt.setString(3,"google");
		FileInputStream fin=new FileInputStream("E:/amit.jpg");
		pstmt.setBlob(4,fin);
		int i=pstmt.executeUpdate();
		System.out.println(i+" row inserted");
		pstmt.close();
		con.close();
		
	}
}

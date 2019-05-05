//Select_image.java
//select image from emps_image table
//using preparedStatement
//driver: type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
class Image_select
{
	public static void main(String k[]) throws Exception
	{
		//driver is automatically loaded
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		PreparedStatement pstmt=con.prepareStatement("select photo from emps_image where empid=?");
		pstmt.setInt(1,111);
		ResultSet rs=pstmt.executeQuery();
		//rs object contains one row with one column contains binary database
        //move cursor for once;
        rs.next();
        //read binary data
		Blob blb=rs.getBlob(1);
		//find length of Blob object
		int len=(int)blb.length();
		//read bytes
		byte b[]=blb.getBytes(1,len);
		//create FileOutputStream object and write byte into file
		FileOutputStream fos=new FileOutputStream("F:/amit.jpg");
		fos.write(b);
		System.out.println("goto F drive and open amit.jpg");
		rs.close();
		pstmt.close();
		con.close();
		
		
		
		
	}
}


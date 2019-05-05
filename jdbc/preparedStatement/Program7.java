//program7.java
//insert multiple record into student table
//using preparedStatement
//driver: type-4(oracle thin driver)
//database:oracle 11g
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
class Program7
{
	public static void main(String args[]) throws Exception
	{
		//driver is automatically loaded
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
        PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
        Scanner s=new Scanner(System.in);
        for(int i=1;i<=3;i++)
		{
			System.out.println("enter student id");
			int sid=s.nextInt();
			System.out.println("enter student name");
			String sname=s.next();
			System.out.println("enter student marks");
			int marks=s.nextInt();
			//set values to pstmt
			pstmt.setInt(1,sid);
			pstmt.setString(2,sname);
			pstmt.setInt(3,marks);
			//execute
			int k=pstmt.executeUpdate();
			System.out.println(k+"row inserted");
		}
		pstmt.close();
		con.close();
}

}
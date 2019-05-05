import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
class Program4
{
	public static void main(String args[]) throws Exception
	{
		Connection con=null;
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","amit");
		if(con!=null)
		{
		Statement stmt=con.createStatement();
		String sql="select * from loan";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.println("Loan_id :"+rs.getInt(1));
		    System.out.println("Loan_type :"+rs.getString(2));
		    System.out.println("Loan_amount :"+rs.getDouble(3));
		}
		rs.close();
		stmt.close();
		con.close();
		}
		else
		{
			System.out.println("connection not estalished");
		}
	}
}
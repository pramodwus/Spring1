//VoterServlet.java
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class VoterServlet extends GenericServlet
{
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
	{
		String name=request.getParameter("name");
		String age=request.getParameter("age");
        int i=Integer.parseInt(age);
        PrintWriter out=response.getWriter();
        if(i>=18)
		{
			out.println("Hi "+name);
			out.println("you are eliegble to vote---");
			
			
		}
        else
		{
			out.println("Hi "+name);
			out.println("you can not vote ----");
		}
		out.close();
	}
	
	
}
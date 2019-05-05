//FirstServlet.java
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class FirstServlet extends GenericServlet
{
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		out.println("welcome to SERVLET");
		out.close();
		
		
	}
	
}
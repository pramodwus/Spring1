package com.spring.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class MailServlet
 */
public class MailServlet extends HttpServlet {
	
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
			String to=request.getParameter("to");
			String subject=request.getParameter("subject");
			String content =request.getParameter("content");
			
			ApplicationContext ctx=
					new ClassPathXmlApplicationContext("spring-config.xml");
			TestBean tb=(TestBean)ctx.getBean("id2");
		    tb.sendEmail(to, subject, content);
		    PrintWriter pw=response.getWriter();
		    pw.println("<h2>Mail Sent Successfully.........</h2>");
		    pw.close();
		    

		
		}

}

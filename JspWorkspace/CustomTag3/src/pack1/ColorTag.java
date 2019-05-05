package pack1;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ColorTag extends SimpleTagSupport

{
	private String colorname;
	


public String getColorname() {
		return colorname;
	}



	public void setColorname(String colorname) {
		this.colorname = colorname;
	}



public void doTag()throws JspException ,IOException
{
	PageContext pageContext=(PageContext)getJspContext();
	JspWriter out=pageContext.getOut();
	JspFragment body=getJspBody();
	StringWriter sw=new StringWriter();
	body.invoke(sw);
	out.println("<font color="+colorname+">");
	out.println(sw);
	out.println("</font>");
	
}
}

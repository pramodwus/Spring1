<!--guess.jsp-->
<%
//read request parameter
int i=Integer.parseInt(request.getParameter("number"));
java.util.Random random=new java.util.Random();
//nextInt(10) genrate random number from 0 to 10
int j=random.nextInt(10);
out.println("<h2>");
out.println("U Entered:"+i);
out.println("<br>");
out.println("Random No :"+j);
out.println("<br>");
if(i==j)

	out.println("Guess is Correct Congrats$");
	else
		out.println("Guess is Wrong Sorry!");
	out.println("</h2>");
%>
<!--login.jsp-->
<jsp:useBean id="loginBean" class="com.sathya.bean.LoginBean" scope="page"/>
<jsp:setProperty name="loginBean" property="*"/>
<h1>
<%
//boolean flag=loginBean.check();
if(flag)
	out.println("Success");
else
	out.println("Failed");
%>
</h1>
<!--price.jsp-->
<%
//read quantity
int quantity=Integer.parseInt(request.getParameter("qty"));
//calcute price
int price=quantity*76;
if(price>10000)
{
	%>
	<jsp:forward page="discount.jsp">
	<jsp:param name="price" value="<%=price%>"/>
	</jsp:forward>
<%	
}
else
{
	%>
	<jsp:forward page="nodiscount.jsp">
	<jsp:param name="price"
	 value="<%=price%>"/>
	 </jsp:forward>
	<%
}
%>
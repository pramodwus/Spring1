<!--nodiscount.jsp-->
<%
//read itemid and quantity
int itemid=Integer.parseInt(request.getParameter("id"));
int quantity=Integer.parseInt(request.getParameter("qty"));
//read price
int price=Integer.parseInt(request.getParameter("price"));
%>
<h2>
Item id :<%=itemid%><br>
Quentity :<%=quantity%><br>
Price : <%=price%><br>
Discount :0<br>
Bill to pay :<%=price%>
</h2>
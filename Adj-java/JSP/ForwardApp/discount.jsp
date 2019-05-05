<!--discount.jsp-->
<%
//read itemid and quantity
int itemid=Integer.parseInt(request.getParameter("id"));
int quantity=Integer.parseInt(request.getParameter("qty"));
//read price
int price=Integer.parseInt(request.getParameter("price"));
//calculate 10% discount
double discount=price*0.10;
double bill=price-discount;
%>
<h2>
Item id :<%=itemid%><br>
Quentity :<%=quantity%><br>
Price : <%=price%><br>
Discount :<%=discount%><br>
Bill to pay :<%=bill%>
</h2>
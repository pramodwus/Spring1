
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<center>
  
  <form:form action="check.form" method="POST" commandName="u">
  <table>
  <tr>
  <td>Username:</td><td><form:input path="uname"/></td>
  <td><font color='red'><form:errors path="uname"/></font></td>
  </tr>
  
  <tr>
  <td>Password:</td><td><form:password path="pwd"/></td>
  <td><font color='red'><form:errors path="pwd"/></font></td>
  </tr>
  
  
  <tr>
  <td></td>
  <td>
  <inpute type=submit value="submit">
   </td>  
  <td></td>
  </tr>







</table>
</form:form>
</center>
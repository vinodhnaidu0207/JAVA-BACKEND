<%@page import="java.util.List"%>
<%@page import="com.flm.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Employee Details</h1>
<table border="1" width="50%">
	<%List<Employee>emps=(List<Employee>)request.getAttribute("xyz");
	  for(Employee emp : emps){
	%>
		<tr>
			<th><%=emp.getId() %></th>
			<th><%=emp.getName() %></th>
			<th><%=emp.getAddress() %></th>
			<th><%=emp.getSalary() %></th>
		</tr>
	<%
	  }
	%>
</table>
</body>
</html>
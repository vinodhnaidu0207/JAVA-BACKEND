<%@page import="java.util.List"%>
<%@page import="com.flm.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO SPRING DATA WEB....</h1>
<table border="1" width="50%">
	<% List<Employee>emps = (List<Employee>)request.getAttribute("abc"); 
		for(Employee emp:emps){
	%>
		<tr>
			<td><%=emp.getId() %></td>
			<td><%=emp.getName() %></td>
			<td><%=emp.getAddress()%></td>
			<td><%=emp.getSalary() %></td>		
		</tr>
	<%
		}
	%>
</table>
</body>
</html>
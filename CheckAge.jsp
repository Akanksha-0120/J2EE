<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String a= request.getParameter("myage");
int age=Integer.parseInt(a);

if(age>=18) out.print("Congratulation....You are eligible to vote!!!!");
else out.print("Sorry...Age must be 18 or above to vote!!!");

%>

</body>
</html>
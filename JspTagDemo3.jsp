<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Scriptlet Tag used to write java source code except method creating-->

<% 
  int a=20;
  int b=110;
  
  int sum=a+b;

%>

<%=
"Sum of "+a+" and "+b+" is : "+sum
%>

</body>
</html>
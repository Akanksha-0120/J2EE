<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
   int square(int n){
	return n*n;
  }
%>


<h1>
<%= "Square of 3 is : "+square(3)%>
</h1>


</body>
</html>
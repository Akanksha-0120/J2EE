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
String name=request.getParameter("name");
String email=request.getParameter("email");
String course=request.getParameter("course");
String rating=request.getParameter("rating");
String feedback=request.getParameter("feedback");

if(name=="" || email=="" ||course==null || rating==null || feedback==""){
	out.println("<h3 style='color:red;'>Please fill the required fields</h3>");
	out.println("<a href='feedback.jsp'>Go Back</a>");
}
else{
	out.println("<h3 style='color:green;'>Thank you for your valuable feedback!!</h3>");
}

%>

</body>
</html>
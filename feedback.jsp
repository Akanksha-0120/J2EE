<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Student Feedback Form</h2>
<form action="result.jsp" method="post">

 STUDENT NAME : <input type="text" name="name" required><br><br>
 EMAIL : <input type="email" name="email" required><br><br>
 COURSE : <select id="course" name="course" required>
         <option value="" disabled selected></option>
         <option value="Java" >Java</option>
         <option value="Advance Java">Advance Java</option>
         <option value="SQL">SQL</option>
         <option value="Web Technology">Web Technology</option>
      </select><br><br>
 RATING : 
    <input type="radio" id="excellent" name="rating" value="Excellent">
    <label for="excellent">Excellent</label><br>

    <input type="radio" id="good" name="rating" value="Good">
    <label for="good">Good</label><br>

    <input type="radio" id="average" name="rating" value="Average">
    <label for="average">Average</label><br>

    <input type="radio" id="poor" name="rating" value="Poor">
    <label for="poor">Poor</label><br><br>

  FEEDBACK : <textarea id="feedback" name="feedback" required></textarea><br><br>
  SUBMIT : <button type="submit" class="submit-btn">Submit FeedBack</button>
</form>


</body>
</html>
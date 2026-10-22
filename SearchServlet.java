package httpServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	   String info=req.getParameter("info");
	   
	   if(info.equals("Java")) {
		   res.sendRedirect("https://www.w3schools.com/java/");
	   }
	   
	   else res.sendRedirect("demo.html");
   }
}

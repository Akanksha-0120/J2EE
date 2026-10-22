package httpservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/role")
public class RoleServlet extends HttpServlet{
	 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		 String username=req.getParameter("username");
		 
		 if(username.equals("admin")) {
			   res.sendRedirect("AdminDashBoard.html");
		   }
		   
		  if(username.equals("user")) res.sendRedirect("UserDashBoard.html");
	 }
}

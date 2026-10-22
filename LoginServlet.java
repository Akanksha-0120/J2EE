package httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginhere")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		//validate
		if(username.equals("admin") && password.equals("admin123") || username.equals("user") && password.equals("user123")) {
			RequestDispatcher rd=req.getRequestDispatcher("role");
			rd.forward(req, res);
		}
		
		else {
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.print("INCORRECT USERNAME OR PASSWORD !!");
			
			RequestDispatcher rd=req.getRequestDispatcher("loginhere.html");
			rd.include(req, res);				
		}
		
	}
}

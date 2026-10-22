package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String name=req.getParameter("myname");
		
		//creating cookie and store user info
		Cookie ck=new Cookie("username",name);
		
		//add cookie to the re
		res.addCookie(ck);
		
		PrintWriter pw=res.getWriter();
		
		pw.print("<html><body>");
		pw.print("Cookie has been creatd successfully...<br><br>");
		pw.print("<a href='read'>CLICK HERE TO READ THE COOKIE</a>");
		pw.print("</body></html>");
		
	}
}

package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/show")
public class ShowServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String name=req.getParameter("myname");
		
		
		HttpSession sess=req.getSession();
		sess.setAttribute("username",name);
		
		
		PrintWriter pw=res.getWriter();
		
		pw.print("<html><body>");
		pw.print("HttpSession is creatd successfully...<br><br>");
		pw.print("<a href='view'>CLICK HERE TO READ THE HttpSession</a>");
		pw.print("</body></html>");
		
	}
}

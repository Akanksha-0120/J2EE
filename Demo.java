package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class Demo extends HttpServlet{
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	    String name=req.getParameter("myname");
	   
	    PrintWriter pw=res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>WelCome "+name+"</h1>");
		pw.print("</html></body>");
   }
   
}

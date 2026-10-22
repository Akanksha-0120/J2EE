package genericServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/index")
public class IndexServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("myname");
		
		PrintWriter pw=res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>WelCome "+name+"</h1>");
		pw.print("</html></body>");
		
	}
     

}

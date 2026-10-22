package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")

public class DisplapServlet extends HttpServlet{
	 @Override
	   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		    String name=req.getParameter("myname");
		    String phone=req.getParameter("phone");
		    String college=req.getParameter("college");
		    String yop=req.getParameter("date");
		    String percentage=req.getParameter("percentage");
		   
		    PrintWriter pw=res.getWriter();
			pw.print("<html><body>");
			pw.print("<h2>User Details</h2>");
			pw.print("NAME: "+name+"<br>");
			pw.print("PHONE NUMBER: "+phone+"<br>");
			pw.print("COLLEGE: "+college+"<br>");
			pw.print(" YOP: "+yop+"<br>");
			pw.print("PERCENTAGE: "+percentage+"<br>");
			pw.print("</html></body>");
	   }

}

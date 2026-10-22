package genericServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/info")
public class InfoServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name=req.getParameter("myname");
        String email=req.getParameter("email");
        String phone=req.getParameter("phone");
        String address=req.getParameter("address");
        String gender=req.getParameter("gender");
        String dob=req.getParameter("dob");
		
		PrintWriter pw=res.getWriter();
		pw.print("<html><body><h3>Thank You for the Submission!!</h3>");
		pw.print("<h2>User Details</h2>");
		pw.print("NAME: "+name+"<br>");
		pw.print("EMAIL ID: "+email+"<br>");
		pw.print("PHONE NUMBER: "+phone+"<br>");
		pw.print("ADDRESS: "+address+"<br>");
		pw.print("GENDER: "+gender+"<br>");
		pw.print(" DOB: "+dob+"<br></body></html>");
		
	}

}

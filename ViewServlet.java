package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/view")
public class ViewServlet extends HttpServlet{

		protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
			
			PrintWriter pw=res.getWriter();
			
			HttpSession sess=req.getSession(false);
			
			if(sess!=null) {
				pw.print("Request coming from same client");
				pw.println();
				pw.print("WelCome..."+sess.getAttribute("username"));
			}
			else pw.print("Request coming from different client");
		}

}

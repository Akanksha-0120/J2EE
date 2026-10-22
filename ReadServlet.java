package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		
		//getting cookie from the req
		Cookie[] cookies=req.getCookies();
		
		//check if cookie obj for this client is exist or not
		if(cookies !=null) {
			pw.print("Cookie found. Request has been send by same client");
			
			pw.println();
			
			//accessing information inside cookie
			for(Cookie ck:cookies) {
				pw.print("Cookie name : "+ck.getName()+" , value : "+ck.getValue());
			}
		}
		else pw.print("Cookie not found. Request has been send by different client");
	}
}

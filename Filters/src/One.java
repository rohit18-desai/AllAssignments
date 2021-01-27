import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class One extends HttpServlet{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	out.println("In servlet..");
	
	String user=req.getParameter("txtnm");
	String pass=req.getParameter("txtpwd");
	
	if(user.equals("admin")&& pass.equals("admin")) {
		out.print("welcome....");
		
	}else {
		out.println("Invalid User......");
	}
}
}

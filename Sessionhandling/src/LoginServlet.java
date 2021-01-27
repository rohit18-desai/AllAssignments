import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		String user=req.getParameter("txtnm");
		String pass=req.getParameter("txtpwd");
		int count=0;
		
		if(user.equals("admin")&& pass.equals("admin")) {
			HttpSession session = req.getSession();
			session.setAttribute("key", count++);
			resp.sendRedirect("ProfileServlet");
			
		}else {
			out.println("Invalid User......");
		}
	}

}

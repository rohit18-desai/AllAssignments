import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			PrintWriter out = resp.getWriter();
			HttpSession session= req.getSession(false);
			if(session != null) {
				//out.println("welcome this is profile page");
				int count =  (int) session. getAttribute( "key" );
				session.setAttribute("key", count++);
				resp.sendRedirect("ProfileServlet");
				//out.println(session.getId());
				//session.invalidate();		
			}else {
				out.print("login again");
			}
			
			
	}

}

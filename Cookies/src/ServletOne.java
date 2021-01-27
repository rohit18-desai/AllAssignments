import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ServletOne extends HttpServlet{

	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("txtnm");
		String pass = request.getParameter("txtpwd");
		if (user.equals("admin") && pass.equals("admin")) {
			Cookie ck = new Cookie("sessionid", "070707");
			response.addCookie(ck);

			RequestDispatcher d = request.getRequestDispatcher("ServletTwo");

			d.forward(request, response);

		} else {
			out.println("......Invalid User.....");
		}
	}
}

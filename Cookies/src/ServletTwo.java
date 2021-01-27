import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTwo extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		Cookie ck[] = req.getCookies();
		if (ck != null) {
			out.println("Profile page");
			out.print(ck[0].getValue());
			// SESSION END or LOG OUT
			ck[0].setMaxAge(0);
			resp.addCookie(ck[0]);
		} else {
			out.println("Please login....");
		}
	}
}

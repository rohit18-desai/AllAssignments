import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		boolean status=false; 
		String n = req.getParameter("txtnm");
		String p = req.getParameter("txtpwd");
		System.out.println("Name :-"+n);
		System.out.println("Pwd :-"+p);
		
		if(LoginDao.validate(p, n)) {
			System.out.println("If true..");
			RequestDispatcher rd = req.getRequestDispatcher("welcome");
	        rd.forward(req,resp);  
	    }  
	    else{  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=req.getRequestDispatcher("index.html");  
	        rd.include(req,resp);  
	    }  
	          
	    out.close();  
		

	

	}
}

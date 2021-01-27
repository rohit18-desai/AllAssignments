import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

@WebServlet("/addData")
public class Employee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		out.println("In post");
		
		String nm=req.getParameter("txtnm");
		String city=req.getParameter("txtcity");
		int sal=Integer.parseInt(req.getParameter("txtsal"));

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "Rohit", "Rohit@123");
			Statement st = con.createStatement();
			st.execute("insert into employee values('hruta','pune',725000)");
			//st.execute("insert into employee values(nm,city,sal)");
			//st.executeUpdate("insert into employee values("+nm+","+city+","+sal+")");
			
			/*
			 * ResultSet rs=st.executeQuery("select * from think_emp");
			 * 
			 * while(rs.next()) {
			 * System.out.println(rs.getString("ename")+" "+rs.getInt("ecity")+" "+rs.getInt
			 * ("salary")); }
			 * 
			 */
			con.close();
			
			resp.sendRedirect("demo");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

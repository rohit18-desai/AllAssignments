import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	public static boolean validate(String name, String pass) {
		boolean status = false;
		
		System.out.println("In validate...");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training", "Rohit", "Rohit@123");
			Statement st = con.createStatement();
			st.execute("insert into login values('dhoni','ranchi')");	
			//st.execute("insert into employee values('hruta','pune',455000)");
			/*
			 * PreparedStatement ps =
			 * con.prepareStatement("select * from login where username=? and password=?");
			 * ps.setString(1, name); ps.setString(2, pass);
			 */

			/*
			 * ResultSet rs = ps.executeQuery(); status = rs.next();
			 */
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return status;
	}

}

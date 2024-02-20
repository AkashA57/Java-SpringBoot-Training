package login.verification;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//reading data coming from the client
				String name = request.getParameter("username");
				String pass = request.getParameter("password");
			
				
				try {
					//load or register the driver
					Class.forName("com.mysql.cj.jdbc.Driver");

					// Creating connection
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root1234");
					

					// creating statement
					PreparedStatement ps = conn.prepareStatement("select * from profile  where username=? and password=?");
					ps.setString(1, name);
					ps.setString(2, pass);

					// execute query
					ResultSet rs = ps.executeQuery();//for fetching records
					
					
					if (rs.next()) {//if user exist 
						 System.out.println("Valid User");
						String username = rs.getString(1);
						String password = rs.getString(2);
						String fullname = rs.getString(3);
						String email = rs.getString(4);
						String gender = rs.getString(5);

						request.setAttribute("username", username);
						request.setAttribute("password", password);
						request.setAttribute("fullname", fullname);
						request.setAttribute("email", email);
						request.setAttribute("gender", gender);
						
								
					request.getRequestDispatcher("congratulations.jsp").forward(request, response);

					}

					else {
						System.out.println("User does not exist or user name/password incorrect. ");
						request.setAttribute("user", "Wrong User name/Password or invalid user");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

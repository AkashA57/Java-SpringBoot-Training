package login.verification;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.java.UserDTO;



@WebServlet("/showAllUser")
public class ShowAllUser extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
			// Register or Load the Driver class
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			// Creating connection
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root1234");
			
			//creating statement 
			 PreparedStatement	ps = conn.prepareStatement("select * from profile");
				
				//execute the code
			ResultSet rs=ps.executeQuery();
			
			List<UserDTO> userList = new ArrayList<>();
			
			while(rs.next()){	     
		        
				String username = rs.getString(1);
				String password = rs.getString(2);
				String fullname1 = rs.getString(3);
				String email = rs.getString(4);
				String gender = rs.getString(5);

				
				UserDTO userdto = new UserDTO(username, password, fullname1, email, gender);
				userList.add(userdto);
			}
			
			request.setAttribute("UsersList", userList);
			request.getRequestDispatcher("fulllist.jsp").forward(request, response);
				
				
			     
				
			      
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

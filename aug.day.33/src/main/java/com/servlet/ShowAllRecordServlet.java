package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.java.UserEntry;

@WebServlet("/getALLRecords")
public class ShowAllRecordServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		// Register or Load the Driver class

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Creating connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root1234");
			// creating statement
			PreparedStatement ps = conn.prepareStatement("select * from profile ");
			// execute query
			ResultSet rs = ps.executeQuery();
			// creating array for storing more than one tuple
			List<UserEntry> user=new ArrayList<UserEntry>();

			while (rs.next()) {
				String username1 = rs.getString(1);
				String password = rs.getString(2);
				String fullname = rs.getString(3);
				String email = rs.getString(4);
				String gender = rs.getString(5);
				
				UserEntry user1=new UserEntry(username1,password,fullname,email,gender);
				user.add(user1);
			}
			
//			for(UserEntry xyz:user) {
//				System.out.println(xyz);
//			}
			 
			    request.setAttribute("userslist", user);
				request.getRequestDispatcher("allUsers.jsp").forward(request, response);
									
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}

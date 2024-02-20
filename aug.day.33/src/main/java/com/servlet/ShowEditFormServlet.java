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

//import com.java.UserDTO;

@WebServlet("/showEditFormServlet")
public class ShowEditFormServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//reading data coming from the client
		String name = request.getParameter("username");
		
		List<UserEntry> user=new ArrayList<UserEntry>();

		try {
			//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root1234");
			// if we write here Connection conn then itwill be a local variable

			// creating statement
			PreparedStatement ps = conn.prepareStatement("select * from profile  where username=?");
			ps.setString(1, name);
			

			// execute query
			ResultSet rs = ps.executeQuery();//for fetching records
			
			
			if (rs.next()) {//if user exist 
				// System.out.println("Valid User");
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
				
				
				UserEntry user1=new UserEntry(username,password,fullname,email,gender);
				
				
				
				request.setAttribute("username", user1);
			request.getRequestDispatcher("edit.jsp").forward(request, response);

			}

			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

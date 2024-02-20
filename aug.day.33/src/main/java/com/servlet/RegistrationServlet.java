package com.servlet;

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


import com.java.UserEntry;

@WebServlet("/registrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// reading data coming from the client
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");

		try {
			// load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root1234");
			// if we write here Connection conn then itwill be a local variable

			// creating statement
			PreparedStatement ps = conn.prepareStatement("insert into profile values(?,?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, fullname);
			ps.setString(4, email);
			ps.setString(5, gender);

			// execute query
			int noOfInsertedValues = ps.executeUpdate();

			if (noOfInsertedValues > 0) {
				//System.out.println("Inserted Successfully");
				
				UserEntry userdto=new UserEntry(username,password,fullname,email,gender);
				
				request.setAttribute("username", userdto);
			request.getRequestDispatcher("congratulations.jsp").forward(request, response);
				
			System.out.println("Inserted Successfully");
				
				
				
			} else {
				System.out.println("Not Serted");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
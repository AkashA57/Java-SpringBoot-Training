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

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {

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
			PreparedStatement ps = conn.prepareStatement("update profile set password=?,fullname=?, email=?, gender=? where username=?");
			
			ps.setString(1, password);
			ps.setString(2, fullname);
			ps.setString(3, email);
			ps.setString(4, gender);
			ps.setString(5, username);

			// execute query
			int noOfUpdatedRows = ps.executeUpdate();

			if (noOfUpdatedRows > 0) {
				//System.out.println("Updated Successfully");
				
				//UserEntry userdto=new UserEntry(username,password,fullname,email,gender);
				
				//request.setAttribute("userDTO", userdto);
			//request.getRequestDispatcher("congratulations.jsp").forward(request, response);
				
			response.sendRedirect("getALLRecords");
				
				
				
			} else {
				System.out.println("Not updated");
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

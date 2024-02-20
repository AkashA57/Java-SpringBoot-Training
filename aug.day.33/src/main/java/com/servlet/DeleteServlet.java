package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.UserEntry;

@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");

		try {
			// load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creating connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root1234");
			// if we write here Connection conn then itwill be a local variable

			// creating statement
			PreparedStatement ps = conn.prepareStatement("delete from profile  where username=?");
			ps.setString(1, username);

			// execute query
			int noOfDeletedValues = ps.executeUpdate();

			if (noOfDeletedValues > 0) {

				System.out.println("Deleted Successfully");

				// Here first time this servlet is calling another servlet
				// which url pattern is = /getALLRecords
				// getALLRecords -> this servlet will show all the data from the database

				request.getRequestDispatcher("getALLRecords").forward(request, response);
			}

			else {
				System.out.println("Not Deleted");
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

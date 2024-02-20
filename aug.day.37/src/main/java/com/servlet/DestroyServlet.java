package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/destroyServlet")
public class DestroyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		      // code for Getting existing session
				HttpSession existingSession = request.getSession(false); 
		// please give me the existing session, if any. Do not create new session	
		
				if (existingSession != null) {
					existingSession.invalidate(); // destroy the session
				}
				
				
				
				RequestDispatcher rd = request.getRequestDispatcher("fact.jsp");
				rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

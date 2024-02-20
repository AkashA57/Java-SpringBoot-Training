package com.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/factorialServlet")
public class FactorialServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stringNum = request.getParameter("num");
		
		int inputNum = Integer.parseInt(stringNum);
		int answerFactorial = 1;
		for(int i = 1; i<=inputNum; i++) {
			answerFactorial = answerFactorial * i;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("result", answerFactorial); 
		//request.setAttribute("answer", answerFactorial);
		
		//Application Scope
		ServletContext applicationScope = getServletContext();
		applicationScope.setAttribute("email", "xyz@gmail.com");
		
		request.getRequestDispatcher("fact.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

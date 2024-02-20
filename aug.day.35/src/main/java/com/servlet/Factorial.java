package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/factorial")
public class Factorial extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stringNum = request.getParameter("number");
		
		int inputNum = Integer.parseInt(stringNum);
		int answerFactorial = 1;
		for(int i = 1; i<=inputNum; i++) {
			answerFactorial = answerFactorial * i;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("answer", answerFactorial); 
		//request.setAttribute("answer", answerFactorial);
		
		request.getRequestDispatcher("fact1.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

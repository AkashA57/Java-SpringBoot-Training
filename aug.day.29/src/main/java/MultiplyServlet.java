import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/multiplyServlet")
public class MultiplyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//passing two values in the form of string/text		
	String number1=request.getParameter("num1");
	String number2=request.getParameter("num2");
	
	// converting string value(s) in Integer type
	int x=Integer.parseInt(number1);
	int y=Integer.parseInt(number2);
	int multiply=x*y;
	System.out.println(multiply);
	
	request.setAttribute("multiplication", multiply);
	request.setAttribute("text1", "Sum of two numbers are:");
	request.setAttribute("text2", "Multiplication of two numbers are:");
	
	//RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
	//rd.forward(request, response);
	
	//request.getRequestDispatcher("result.jsp").forward(request, response);
	
	request.getRequestDispatcher("multiplication.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

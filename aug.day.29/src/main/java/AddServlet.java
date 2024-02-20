import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Console doGet method");
	//passing two values in the form of string/text		
	String number1=request.getParameter("num1");
	String number2=request.getParameter("num2");
	
	// converting string value(s) in Integer type
	int x=Integer.parseInt(number1);
	int y=Integer.parseInt(number2);
	int sum=x+y;
	System.out.println(sum);
	
	request.setAttribute("addition", sum);
	request.setAttribute("text1", "Sum of two numbers are:");
	
	//RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
	//rd.forward(request, response);
	
	//request.getRequestDispatcher("result.jsp").forward(request, response);
	
	request.getRequestDispatcher("addition.jsp").forward(request, response);
	}

	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Console doPost method");
//		doGet(request, response);
//	}

}


package calculator;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletController")



	public class Servletcontroller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	 
	 double c;
		 
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException 
	{
	BasicCalc Det=new BasicCalc();
	double a=Double.valueOf(req.getParameter("a"));
	double b=Double.valueOf(req.getParameter("b"));
	Det.setA(a);   
	 Det.setB(b); 
	String operation=req.getParameter("operation");
	
switch( operation)		
{
	case "Add":
		c=Det.add();
		System.out.println("c");
break;
	case "Subtract":
		c=Det.subtract();
		System.out.println("c");
break;
	case "Multiply":
		c=Det.multiply();
		System.out.println("c");
break;
	case "Divide":
		c=Det.divide();
		System.out.println("c");
break;
default:System.out.println("wrong choice");
		}
	req.setAttribute("answer",c);
				//write switch cases for calling different method of operations
		
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward (req, resp); 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	doGet(req, resp);

	
	
	
	}
}
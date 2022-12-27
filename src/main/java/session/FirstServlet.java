package session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("t1");
		System.out.println(name);
		
		
	//	RequestDispatcher dispatcher=request.getRequestDispatcher("SecondServlet");
	//	dispatcher.forward(request, response);
		
		HttpSession session=request.getSession();
		session.setAttribute("t1", name);
		response.sendRedirect("SecondServlet");
	}

	
	

}

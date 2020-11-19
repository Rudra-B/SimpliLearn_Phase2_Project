package adminController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/changepwd")
public class AdminChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession httpsession=request.getSession();
		if(httpsession.getAttribute("admin_id")==null)
		{
			RequestDispatcher rd=request.getRequestDispatcher("admin/login.jsp");
			rd.forward(request, response);
		}
		
		
		RequestDispatcher rd=request.getRequestDispatcher("admin/changepassword.jsp");
		rd.forward(request, response);
		
		
	}

}

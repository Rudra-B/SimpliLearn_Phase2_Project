package adminController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Admin;
import services.AdminService;

@WebServlet(name="/adminloginaction")
public class AdminLoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
   AdminService service=new AdminService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin_id=request.getParameter("admin_id");
		String admin_pwd=request.getParameter("admin_pwd");
		if(admin_id.equals("") || admin_pwd.equals("") || admin_id.equals(null) || admin_pwd.equals(null))
		{
			request.getRequestDispatcher("admin/login.jsp").forward(request, response);
		}
		
		Admin admin=service.authenticate(admin_id, admin_pwd);
		
		if(admin==null)
		{
			request.getRequestDispatcher("admin/login.jsp").forward(request, response);
			
		}
		else
		{
		
		HttpSession httpsession=request.getSession();
		httpsession.setAttribute("admin_id", admin.getId());
		
		
			RequestDispatcher rd=request.getRequestDispatcher("admin/dashboard.jsp");
			rd.forward(request, response);
		}
			
		
		
	}

}

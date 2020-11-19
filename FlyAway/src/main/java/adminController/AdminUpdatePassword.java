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

@WebServlet("/updatepassword")
public class AdminUpdatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	AdminService service=new AdminService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession httpsession =request.getSession();
		if(httpsession.getAttribute("admin_id")==null)
		{
			RequestDispatcher rd=request.getRequestDispatcher("admin/login.jsp");
			rd.forward(request, response);
		}
		
		String pwd=request.getParameter("pwd");
		String pwd2=request.getParameter("pwd2");
		
		if (pwd == null || pwd2 == null || pwd.equals("") || pwd2.equals("")) {
			RequestDispatcher rd=request.getRequestDispatcher("admin/login.jsp");
			rd.forward(request, response);
		  }else
		  {
		
		Admin admin = service.getAdminByid((long)httpsession.getAttribute("admin_id"));
		System.out.println(admin.getId());
		admin.setPwd(pwd);
		service.updatePassword(admin);
		
		RequestDispatcher rd=request.getRequestDispatcher("admin/dashboard.jsp");
		rd.forward(request, response);
		  }
	}

}

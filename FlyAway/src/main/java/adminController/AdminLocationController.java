package adminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Location;
import services.AdminService;



@WebServlet("/adminlocation")
public class AdminLocationController extends HttpServlet {

	
	AdminService service= new AdminService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Location> list=service.getLocations();
		request.setAttribute("list", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("admin/Locations.jsp");
		rd.forward(request, response);
	}


}

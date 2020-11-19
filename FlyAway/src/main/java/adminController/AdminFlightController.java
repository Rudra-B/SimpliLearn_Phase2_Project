package adminController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Flight;
import services.AdminService;

@WebServlet("/adminflights")
public class AdminFlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AdminService service=new AdminService();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

List<Flight> list = new ArrayList<>();

		

		list=(ArrayList) service.getFlights();

		request.setAttribute("adminflight", list);
		RequestDispatcher rd = request.getRequestDispatcher("admin/flights.jsp");
		rd.forward(request, response);
	
	}


}

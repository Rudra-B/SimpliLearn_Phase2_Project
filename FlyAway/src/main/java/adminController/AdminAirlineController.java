package adminController;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Temp.SessionFactoryObj;
import entity.Airline;
import services.AdminService;

@WebServlet("/adminairline")
public class AdminAirlineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	AdminService service=new AdminService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Airline> airlinelist=(ArrayList<Airline>)service.getAirlines();
		
		request.setAttribute("airlinelist", airlinelist);
		
		request.getRequestDispatcher("admin/airlines.jsp").forward(request, response);
	}


}

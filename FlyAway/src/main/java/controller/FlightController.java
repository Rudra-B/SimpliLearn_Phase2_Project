package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Flight;
import services.FlightDetailsService;

/**
 * Servlet implementation class FlightController
 */
@WebServlet("/FlightDetails")
public class FlightController extends HttpServlet {
	
   FlightDetailsService service= new FlightDetailsService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flightid=request.getParameter("flightid");
		String flightPrice=request.getParameter("flightprice");
		HttpSession session=request.getSession(false);
		session.setAttribute("flightid", flightid);
		session.setAttribute("flightprice", flightPrice);
		Flight flight=(Flight)service.getFlightDetails(flightid);
		
		request.setAttribute("flight", flight);
		
		RequestDispatcher rd=request.getRequestDispatcher("FlightDetails.jsp");
		rd.forward(request, response);
		
	}

	

}

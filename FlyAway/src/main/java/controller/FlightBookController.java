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
import entity.Traveller;
import services.FlightDetailsService;


@WebServlet("/Book")
public class FlightBookController extends HttpServlet {

	FlightDetailsService service= new FlightDetailsService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession(false);
		String flightid=(String)session.getAttribute("flightid");
		String firstName =request.getParameter("firstname");
		String lastName =request.getParameter("lastname");
		String mobile =request.getParameter("mobile");
		String email =request.getParameter("email");
		Traveller traveller=new Traveller(firstName,lastName,mobile,email,flightid);
		
		session.setAttribute("traveller", traveller);
		
       Flight flight=(Flight)service.getFlightDetails(flightid);
		
		request.setAttribute("flight", flight);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("flightVerify.jsp");
		rd.forward(request, response);
	}

}

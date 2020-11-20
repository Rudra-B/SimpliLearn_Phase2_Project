package controller;

import java.io.IOException; 
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Temp.SessionFactoryObj;
import entity.Flight;
import services.FlightDetailsService;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	FlightDetailsService flightdetails = new FlightDetailsService();

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//HttpSession session = request.getSession();
		List<Flight> list = new ArrayList<>();
		
		String source=request.getParameter("from");
		String destination=request.getParameter("to");
		String date=request.getParameter("date");
		
		

		if(source.equals("") || source.equals(null) || destination.equals("") || destination.equals(null)|| date.equals(null)||date.equals(""))
		{
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else
		{
			list=(ArrayList) flightdetails.getFlights(source,destination,date);

			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("Flight.jsp");
			rd.forward(request, response);
			
		}
		
	}

}

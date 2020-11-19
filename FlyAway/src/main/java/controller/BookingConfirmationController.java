package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Temp.SessionFactoryObj;
import entity.Traveller;

@WebServlet("/bookingconfirmation")
public class BookingConfirmationController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    HttpSession httpsession=request.getSession(false);
	    Traveller traveller=(Traveller)httpsession.getAttribute("traveller");
	    
		
		Session session=SessionFactoryObj.sessionfactory().getCurrentSession();
		session.beginTransaction();
		
		session.save(traveller);
		session.getTransaction().commit();
		session.close();
		
		RequestDispatcher rd=request.getRequestDispatcher("ConfirmBooking.jsp");
		rd.forward(request, response);
		
		
	}



}

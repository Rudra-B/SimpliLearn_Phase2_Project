package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/paymentaction")
public class PaymentControllerAction extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String cardNumber=request.getParameter("cardnumber");
		String expiryDate=request.getParameter("expirydate");
		String cvv=request.getParameter("cvv");
		
		
		RequestDispatcher rd=request.getRequestDispatcher("bookingconfirmation");
		rd.forward(request, response);
		
	}

}

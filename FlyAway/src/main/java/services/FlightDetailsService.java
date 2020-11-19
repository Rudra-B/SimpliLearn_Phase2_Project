package services;


import java.util.Date;
import java.util.List;

import dao.FlightDetailsDao;
import entity.Flight;

public class FlightDetailsService {

	FlightDetailsDao dao=new FlightDetailsDao();
	public Flight getFlightDetails(String flightid)
	{
		
		
		
		
		return dao.getFlightDetails(flightid);
	}
	
	
	public List<Flight> getFlights(String source,String Destination,String date)
	{
		
		return dao.getFlights(source,Destination,date);
	}
	
	
	
	
}

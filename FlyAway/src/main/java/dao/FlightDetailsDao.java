package dao;




import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Temp.SessionFactoryObj;
import entity.Flight;

public class FlightDetailsDao {
	
	SessionFactory sessionFactory=SessionFactoryObj.sessionfactory();
	@SuppressWarnings("unchecked")
	public Flight getFlightDetails(String flightid)
	{
	
		Session session=sessionFactory.getCurrentSession();
		
		Transaction t = session.beginTransaction();
		List<Flight> list=new ArrayList<>();
		list=session.createQuery("From Flight where id="+flightid).list();
		t.commit();
		session.close();
		
		//SessionFactoryObj.sessionfactory().close();
		
		
		if(list.size()>0)
		{
			return (Flight)list.get(0);
		}else
		{
			return null;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Flight> getFlights(String source,String destination,String date)
	{
		//Session session=SessionFactoryObj.sessionfactory().getCurrentSession();

		Session session=sessionFactory.getCurrentSession();
		Transaction t = session.beginTransaction();
		List<Flight> flightlist=new ArrayList<>();
		
		flightlist=session.createQuery("From Flight where source1 = '"+source+"' and destination = '"+destination+"' and date1 = '"+date+"'").getResultList();
		t.commit();
		session.close();
	
		
		
		return flightlist;
	}

}

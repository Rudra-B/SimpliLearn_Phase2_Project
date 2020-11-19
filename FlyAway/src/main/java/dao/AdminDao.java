package dao;

import java.util.List;

import org.hibernate.Session;

import Temp.SessionFactoryObj;
import entity.Admin;
import entity.Airline;
import entity.Flight;
import entity.Location;

public class AdminDao {
	
	SessionFactoryObj sessionFactory;
	public Admin authenticate(String admin_id, String admin_pwd)
	{
		@SuppressWarnings({ "unchecked", "static-access" })
		List<Admin> list=this.sessionFactory.sessionfactory().openSession().createQuery("from Admin where admin_id=:admin_id and admin_pwd=:admin_pwd")
				.setParameter("admin_id", admin_id)
				.setParameter("admin_pwd", admin_pwd)
				.list();
		
		if(list.size()>0)
			return (Admin)list.get(0);
		else
			return null;
	}
	
	
	public Admin getAdminById(long id)
	{
		List<Admin> list =this.sessionFactory.sessionfactory().openSession().createQuery("From Admin where id=:id")
		.setParameter("id", id).getResultList();
		
		if(list.size()>0)
		{
			return (Admin)list.get(0);
		}
		else
		{
			return null;
		}
	}
	
	@SuppressWarnings("static-access")
	public void updatePassword(Admin admin)
	{
		Session session=this.sessionFactory.sessionfactory().openSession();
		session.beginTransaction();
		session.createQuery("update Admin set admin_pwd=:admin_pwd where ID=:id")
		.setParameter("admin_pwd", admin.getPwd())
		.setParameter("id", admin.getId())
		.executeUpdate();
		
		session.getTransaction().commit();
		session.close();
		
	}
	
	public List<Location> getLocations()
	{
		Session session=this.sessionFactory.sessionfactory().openSession();
		session.beginTransaction();
		List<Location> list=session.createQuery("From Location").getResultList();
		
		
		session.getTransaction().commit();
		session.close();
		return list;
	}
	
	
	public List<Flight> getFlights()
	{
		Session session=this.sessionFactory.sessionfactory().openSession();
		session.beginTransaction();
		List<Flight> list=session.createQuery("From Flight").getResultList();
		
		
		session.getTransaction().commit();
		session.close();
		return list;
	}
	
	
	public List<Airline> getAirlines()
	{
		Session session=this.sessionFactory.sessionfactory().openSession();
		session.beginTransaction();
		List<Airline> list=session.createQuery("From Airline").getResultList();
		
		
		session.getTransaction().commit();
		session.close();
		return list;
	}
	
}

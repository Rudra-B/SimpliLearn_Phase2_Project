package services;

import java.util.List;

import dao.AdminDao;
import entity.Admin;
import entity.Airline;
import entity.Flight;
import entity.Location;

public class AdminService {

	AdminDao dao=new AdminDao();
	public Admin authenticate(String admin_id,String admin_pwd)
	{
		
		return dao.authenticate(admin_id, admin_pwd);
		
	}
	
	
	public Admin getAdminByid(long id)
	{
		return dao.getAdminById(id);
	}
	
	public void updatePassword(Admin admin)
	{
		dao.updatePassword(admin);
		
	}
	
	public List<Location> getLocations()
	{
		return dao.getLocations();
	}
	
	public List<Flight> getFlights()
	{
		return dao.getFlights();
	}
	
	
	public List<Airline> getAirlines()
	{
		return dao.getAirlines();
	}
	
	
}

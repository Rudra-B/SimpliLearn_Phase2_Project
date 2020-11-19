package Temp;

import javax.sql.rowset.spi.SyncResolver;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import entity.Admin;
import entity.Airline;
import entity.Flight;
import entity.Location;
import entity.Traveller;

public class SessionFactoryObj {
	
	private SessionFactoryObj()
	{
		
	}
	 static SessionFactory sesfact;
	
	
	public static SessionFactory sessionfactory()
	{
		
		
		if(sesfact==null)
		{
			
			
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Flight.class);
		configuration.addAnnotatedClass(Traveller.class);
		configuration.addAnnotatedClass(Admin.class);
		configuration.addAnnotatedClass(Location.class);
		configuration.addAnnotatedClass(Airline.class);
		ServiceRegistry svc=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		 sesfact=configuration.buildSessionFactory(svc);
		}
		
			return sesfact;
				
	
	}

}

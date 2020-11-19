package Temp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryOb {

	public static SessionFactory getCurrentSessionFromConfig() {
		  // SessionFactory in Hibernate 5 example
		  Configuration config = new Configuration();
		  config.configure();
		  // local SessionFactory bean created
		  SessionFactory sessionFactory = config.buildSessionFactory();
		  Session session = sessionFactory.getCurrentSession();
		  return sessionFactory;
		}
	
}

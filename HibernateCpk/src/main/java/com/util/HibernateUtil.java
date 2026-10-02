package com.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Car;
import com.entity.CarId;


public class HibernateUtil {
	
	public static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Car.class);
			cfg.addAnnotatedClass(CarId.class);
			
			 sessionFactory = cfg.buildSessionFactory();
			 
			 return sessionFactory;
		}
		else {
			
			return sessionFactory;
		}
	}
}

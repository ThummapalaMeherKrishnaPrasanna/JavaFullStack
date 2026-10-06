package com.util;


import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			
			Configuration cfg = new Configuration();
		    cfg.configure("hibernate.cfg.xml");
		    cfg.addAnnotatedClass(Course.class);
		    cfg.addAnnotatedClass(Student.class);
		    sessionFactory = cfg.buildSessionFactory();
		    
		    return sessionFactory;
		}
		else {
			return sessionFactory;
		}
		
	}
}

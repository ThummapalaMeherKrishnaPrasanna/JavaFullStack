package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;


public class EmpOperation {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		
		
		Employee emp = new Employee("Meher" , 15000);
		
		session.beginTransaction();
		
		session.persist(emp);
		
		session.getTransaction().commit();
	}

}

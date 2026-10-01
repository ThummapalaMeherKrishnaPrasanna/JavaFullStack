package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.util.HibernateUtil;

public class StatesPract {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();

	    // transient
		Employee emp2 = new Employee("Krishna" , 18000);
		
		//persistant
		Employee employee = session.find(Employee.class , 1);
		
		session.beginTransaction();
		
		session.persist(emp2);
		
		
	    employee.setSalary(39000);
	
	    emp2.setSalary(20000);
	    
	    session.getTransaction().commit();
	    
		session.close();
		
		employee.setSalary(30000);
	
	}

}

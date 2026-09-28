package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Students;

public class DMLOperations {

	public static void main(String[] args) {
		
	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();
	
	
	// SELECT
	
	Students students = session.find(Students.class , 1);
	
	System.out.println(students);

	
	// Delete
	
	Students stu2 = new Students(5, "" , 0 );
	
	session.beginTransaction();
	
	session.remove(stu2);
	
	session.getTransaction().commit();
	
	
	
	//UPDATE
	
	Students stu3 = session.find(Students.class , 2);
	
	stu3.setMarks(60);
	
	session.beginTransaction();
	
	session.merge(stu3);
	
	session.getTransaction().commit();
	
	
	// Insert
	
	Students stu4 = new Students(5 , "Vani" , 60);
	
	session.beginTransaction();
	
	session.persist(stu4);
	
	session.getTransaction().commit();
	
	}

}

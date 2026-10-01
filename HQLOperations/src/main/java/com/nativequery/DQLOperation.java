package com.nativequery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.entity.Student;
import com.util.HibernateUtil;

public class DQLOperation {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
	    selectUsingWhere(session);
	    
	}

	public static void selectUsingWhere(Session session) {
		NativeQuery<Student> nativeQuery = session.createNativeQuery("select * from students where id = ?1" , Student.class);
	    
	    nativeQuery.setParameter(1 , 2);
	    
	    List<Student> list = nativeQuery.list();
	    
	    System.out.println(list);
	}

	public static void selectAll(Session session) {
		NativeQuery<Student> nativeQuery = session.createNativeQuery("select * from students" , Student.class);
	
	    List<Student> list = nativeQuery.list();
	    
	    System.out.println(list);
	}
}

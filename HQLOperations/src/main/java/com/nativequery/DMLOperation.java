package com.nativequery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;

import com.util.HibernateUtil;

public class DMLOperation {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
	

	}

	public static void deleteOperation(Session session) {
		
		session.beginTransaction();
		
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("delete from students where id = ?1");
		
		nativeMutationQuery.setParameter(1 , 8);
		
		nativeMutationQuery.executeUpdate();
		
		session.beginTransaction().commit();
	}

	public static void updateOperation(Session session) {
		session.beginTransaction();
		
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("update students set marks = ?1 where id = :id ");
	    
		nativeMutationQuery.setParameter(1, 35);
		nativeMutationQuery.setParameter("id" , 8);
		
		nativeMutationQuery.executeUpdate();
		
	   session.getTransaction().commit();
	}

	public static void insertOperation(Session session) {
		session.beginTransaction();
		
		MutationQuery nativeMutationQuery = session.createNativeMutationQuery("insert into students (id , name , marks) values (?1 , ?2, ?3)");
		
		nativeMutationQuery.setParameter(1, 8);
		nativeMutationQuery.setParameter(2, "Rajesh");
		nativeMutationQuery.setParameter(3, 50);
		
		nativeMutationQuery.executeUpdate();
		
	    session.getTransaction().commit();
	}
}

package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;


import com.util.HibernateUtil;

public class DMLOperations {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 
		Session session = sessionFactory.openSession();
		
		insertOperation( session);
		
	}

	public static void deleteQuery(Session session) {
		
		session.beginTransaction();
		
		MutationQuery mutationQuery = session.createMutationQuery("delete from Student where id = ?1");
		
		mutationQuery.setParameter(1,5);
		
		mutationQuery.executeUpdate();
		
		session.beginTransaction().commit();
	}

	public static void updateQuery(Session session) {
		session.beginTransaction();
		
		MutationQuery mutationQuery = session.createMutationQuery("update Student set marks = ?1 where id = :id");
		
		mutationQuery.setParameter(1 , 18);
		mutationQuery.setParameter("id" , 6);
		
		mutationQuery.executeUpdate();
		
		session.getTransaction().commit();
	}

	public static void insertOperation(Session session) {
		session.beginTransaction();
		
		MutationQuery mutationQuery = session.createMutationQuery("Insert Into Student (id , name, marks) values(?1, ?2 , ?3)");
	    
		mutationQuery.setParameter(1,6);
		mutationQuery.setParameter(2,"Rajesh");
		mutationQuery.setParameter(3,50);
		
		mutationQuery.executeUpdate();
		
		session.getTransaction().commit();
	}
	

}

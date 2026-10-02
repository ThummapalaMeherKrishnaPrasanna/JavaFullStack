package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.Student;
import com.util.HibernateUtil;

public class NamedQuery {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		specificStudent(session);
		

	}

	public static void specificStudent(Session session) {
		Query<Student> namedQuery = session.createNamedQuery("specificStudent" ,Student.class);
		
		namedQuery.setParameter(1, 2);
		
		List<Student> list = namedQuery.list();
		
		System.out.println(list);
	}

	public static void selectAll(Session session) {
		
		Query<Student> namedQuery = session.createNamedQuery("allStudents",Student.class);
		
		List<Student> list = namedQuery.list();
		
		System.out.println(list);
	}

}

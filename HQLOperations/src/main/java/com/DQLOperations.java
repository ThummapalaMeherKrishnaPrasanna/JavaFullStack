package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import com.entity.Student;
import com.util.HibernateUtil;

public class DQLOperations {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		selectionUsingWhereClause(session);
		
		
	}

	public static void selectionUsingWhereClause(Session session) {
		SelectionQuery<Student> selectionQuery = session.createSelectionQuery("From Student where id = 1", Student.class);
		
		List<Student> list = selectionQuery.list();
		
		System.out.println(list);
		
		// dynamic data
		
		SelectionQuery<Student> selectionQuery2 = session.createSelectionQuery("From Student where id = ?1" ,Student.class);
		
		selectionQuery2.setParameter(1, 2);
		
		List<Student> list2 = selectionQuery2.list();
		
		System.out.println(list2);
	}

	public static void selectAllStudents(Session session) {
		
		SelectionQuery<Student> selectionQuery = session.createSelectionQuery("select s From Student s",Student.class);
		
		List<Student> list = selectionQuery.list();
		
		System.out.print(list);
	}

}

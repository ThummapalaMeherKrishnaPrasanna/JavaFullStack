package com.entity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class InsertOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		
		System.out.println("Enter how many students data you want to enter");
		int stuCount = sc.nextInt();
		int stuCount2 = 0;
		
		while(stuCount != stuCount2) {
			
			System.out.println("Enter Id");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Name");
			String name = sc.nextLine();
			
			System.out.println("Enter marks");
			int marks = sc.nextInt();
			
			session.beginTransaction();
			
			Students stu = new Students(id, name , marks);
		    
			session.persist(stu);
			
			session.getTransaction().commit();
			
			stuCount2++;
			
		}
		
		System.out.println("All students data entered successfully");
		

	}

}

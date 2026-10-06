package com;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Order;
import com.entity.User;
import com.util.HibernateUtil;

public class OneToMany {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		session.beginTransaction();
	    
		
		Order order1 = new Order("shirt" , 2 , 800);
		Order order2 = new Order("Jean" , 1 , 1200);
		Order order3 = new Order("T shirt" , 3 , 750);
		Order order4 = new Order("Short" , 2 , 600);
		
		List<Order> firstOrder = new ArrayList<>();
        
		firstOrder.add(order1);
		firstOrder.add(order2);
		
		List<Order> secondOrder = new ArrayList<>();
        
		secondOrder.add(order3);
		secondOrder.add(order4);
		
		User user1 = new User("Meher" ,firstOrder);
		
		User user2 = new User("Krishna" , secondOrder);
		
		order1.setUser(user1);
		order2.setUser(user1);
		
		order3.setUser(user2);
		order4.setUser(user2);
		
		session.persist(user1);
		session.persist(user2);
		
		session.getTransaction().commit();
		
		System.out.println("Data inserted");
		

		
	}

}

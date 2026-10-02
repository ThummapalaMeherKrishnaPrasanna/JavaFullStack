package com;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Aadhar;
import com.entity.Citizen;
import com.util.HiberanteUtil;

public class OneToOne {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HiberanteUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
		Aadhar aadhar = new Aadhar(4547844 , LocalDate.now());
		
		Citizen citizen = new Citizen("Satya" , 23, aadhar);
		
		// insert
		session.beginTransaction(); 
		
		session.persist(aadhar);
		session.persist(citizen);
		
		
		session.getTransaction().commit();
		
		
		//select 
		Citizen citizen2 = session.find(Citizen.class , 1);
		
		System.out.println(citizen2);
		
	
	}

}

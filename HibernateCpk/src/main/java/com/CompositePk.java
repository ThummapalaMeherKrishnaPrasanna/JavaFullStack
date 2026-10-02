package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Car;
import com.entity.CarId;
import com.util.HibernateUtil;

public class CompositePk {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	     
		Session session = sessionFactory.openSession();
	     
		CarId carId = new CarId(547, 159);
		
		Car car = new Car(carId ,"shift" , "Suziki", 150000);
		
		session.beginTransaction();
        
		session.persist(car);
		
		session.getTransaction().commit();
		
		
		
		
	
	}
}

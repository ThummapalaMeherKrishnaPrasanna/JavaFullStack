package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Course;
import com.entity.Student;
import com.util.HibernateUtil;

public class ManyToMany {
	
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
	
		session.beginTransaction();
		
		Student st1 = new Student("Meher" , 20);
		Student st2 = new Student("Krishna" , 22);
		Student st3 = new Student("Prasanna" , 21);
		
		List<Student> students1 = new ArrayList<>();
		students1.add(st1);
		students1.add(st2);
		students1.add(st3);
		
		Course course = session.find(Course.class, 1);
		
		List<Course> coursesList = new ArrayList<>();
		
		coursesList.add(course);
		
		course.setStudents(students1);
		
		st1.setCourses(coursesList);
		st2.setCourses(coursesList);
		st3.setCourses(coursesList);
		
		session.persist(course);
		
	 
		session.getTransaction().commit();
		
	}

	public static void addCourses(Session session) {
		Course course1 = new Course("JFS" , 16000);
		Course course2 = new Course("PFS" , 16000);
		Course course3 = new Course("AI" , 17000);
		
		session.beginTransaction();
		
		session.persist(course1);
		session.persist(course2);
		session.persist(course3);		

		session.getTransaction().commit();
	}

	
	
	
}

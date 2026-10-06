package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Department;
import com.entity.Student;
import com.util.HibernateUtil;

public class OneToManyStudentsDep {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Department department = session.find(Department.class , 1);
		
		System.out.println(department);
		System.out.println(department.getStudent());
		
		
	}

	public static void addStudents(Session session) {
		Student stu1 = new Student("Meher" , 22);
		Student stu2 = new Student("Krishna" , 21);
		Student stu3 = new Student("Prasanna" , 20);
		
		List<Student> students = new ArrayList<>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		
	
		Department department = session.find(Department.class , 1);
		
		department.setStudent(students);
		
		stu1.setDepartment(department);
		stu2.setDepartment(department);
		stu3.setDepartment(department);

		session.beginTransaction();
		
		session.persist(department);
		
		session.getTransaction().commit();
	}

	public static void allDepartments(Session session) {
		
		
		Department dep1 = new Department("EEE");
		Department dep2 = new Department("ECE");
		Department dep3= new Department("MECH");
		Department dep4= new Department("CSE");
		
		session.beginTransaction();
		
		session.persist(dep1);
		session.persist(dep2);
		session.persist(dep3);
		session.persist(dep4);
		
		session.getTransaction().commit();
	}
}

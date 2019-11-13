package com.capgemini.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytomany.Course;
import com.capgemini.jpawithhibernate.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		/*
		 * Student student = new Student(); student.setSid(4);
		 * student.setSname("Sambi");
		 */


		Student student1 = new Student(); 
		student1.setSid(3);
		student1.setSname("Divya");

		/*
		 * Student student2 = new Student(); student2.setSid(3);
		 * student2.setSname("Divya");
		 */
		
		/*
		 * ArrayList<Student> sList = new ArrayList<Student>(); sList.add(student);
		 * sList.add(student1); sList.add(student2);
		 */

		Course course = new Course();
		course.setCid(1239);
		course.setCname("SPRING");

		Course course1 = new Course();
		course1.setCid(1240);
		course1.setCname("J2EE");
		
		Course course3 = new Course();
		course3.setCid(1238);
		course3.setCname("ANGULAR");

		ArrayList<Course> cList = new ArrayList<Course>();
		cList.add(course);
		cList.add(course1);
		cList.add(course3);

		student1.setCourse(cList);
		//course1.setStudent(sList);
		try
		{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(student1);
			System.out.println("Record Saved");
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
	}
}

package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Modification {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		String jpql = "update Movie set mname = '1920' where id = 1";
		Query query = entityManager.createQuery(jpql);
		transaction.begin();
		int result = query.executeUpdate();
		transaction.commit();
		if(result == 1)
		{
			System.out.println("Record updated");
		}
		else
		{
			System.out.println("Update rejected");
		}
		
	}
}

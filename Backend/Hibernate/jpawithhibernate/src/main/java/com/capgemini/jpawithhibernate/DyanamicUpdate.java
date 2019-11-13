package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DyanamicUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		String jpql = "update Movie set mname = :name where id = :mid";
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("name", "PK");
		query.setParameter("mid", 1);
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

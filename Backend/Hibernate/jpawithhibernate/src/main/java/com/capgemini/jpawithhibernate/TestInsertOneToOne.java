package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Person;
import com.capgemini.jpawithhibernate.onetoone.VoterCard;

public class TestInsertOneToOne {

	public static void main(String[] args) {

		EntityTransaction transaction = null;
		EntityManager entityManager = null;

		Person person = new Person(); 
		person.setPid(1);
		person.setName("Samba");
		
		VoterCard voter = new VoterCard();
		voter.setVid(1234);
		voter.setAddress("Gandhi Nagar");
		
		person.setVoterCard(voter);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(person);
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

		entityManager.close();
	}
}

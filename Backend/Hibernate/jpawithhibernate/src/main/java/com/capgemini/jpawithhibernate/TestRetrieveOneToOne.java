package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.VoterCard;

public class TestRetrieveOneToOne {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		VoterCard voter = entityManager.find(VoterCard.class, 1234);
		System.out.println("Voter ID: "+voter.getVid());
		System.out.println("Address: "+voter.getAddress());
		System.out.println("Person ID: "+voter.getPersonInfo().getPid());
		System.out.println("Name: "+voter.getPersonInfo().getName());
		
	}
}

package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetomany.Pencil;
import com.capgemini.jpawithhibernate.onetomany.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {

		EntityTransaction transaction = null;
		EntityManager entityManager = null;

		PencilBox pencilBox = new PencilBox(); 
		pencilBox.setBoxId(2);
		pencilBox.setName("Nataraj");
		
		Pencil pencil = new Pencil();
		pencil.setPid(1244);
		pencil.setColour("Red");
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(1245);
		pencil1.setColour("Green");
		
		pencil.setPb1(pencilBox);
		pencil1.setPb1(pencilBox);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			System.out.println("Record Saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
	}

}

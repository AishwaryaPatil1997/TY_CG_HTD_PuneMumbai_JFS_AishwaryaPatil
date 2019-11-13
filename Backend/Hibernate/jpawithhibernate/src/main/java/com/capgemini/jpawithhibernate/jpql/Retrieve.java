package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrieve {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "from Movie";
		Query query = entityManager.createQuery(jpql);
		List<Movie> list = query.getResultList();
		
		for (Movie movie : list) {
			
			System.out.println("ID: "+movie.getId());
			System.out.println("NAME: "+movie.getName());
			System.out.println("RATING: "+movie.getRating());
			System.out.println("-------------------------------");
		}
		
		entityManager.close();
	}
}

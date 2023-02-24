package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Bike;
  

public class Bike_controller {
	public static void main(String[] args) {

		Bike bike = new Bike();

		bike.setName("honda");
		bike.setColor("black");
		bike.setPrice(120000);

		Bike bike1 = new Bike();

		bike.setName("honda");
		bike.setColor("red");
		bike.setPrice(120000);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abby");
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		entityTransaction.begin();
//		entityManager.persist(bike);
//		entityTransaction.commit();
		
		
//		entityTransaction.begin();
//		entityManager.persist(bike1);
//		entityTransaction.commit();
		
		
		
		Bike bike2 = entityManager.find(Bike.class, 1);
		Bike bike3 = entityManager.find(Bike.class, 2);
		System.out.println(bike2);
		System.out.println(bike3);
		
		
		
		
		
		Bike bike4 = entityManager.find(Bike.class, 1);
		Bike bike5 = entityManager.find(Bike.class, 2);
		
		System.out.println(bike4);
		System.out.println(bike5);
			
		
		
		
		

	}

}

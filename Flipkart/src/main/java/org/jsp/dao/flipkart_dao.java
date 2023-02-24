package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Flipkart;


public class flipkart_dao {
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void saveflipkart(Flipkart flipkart) {
		entityTransaction.begin();
		entityManager.merge(flipkart);
		entityTransaction.commit();
	}
	
	public void deleteflipkart(Flipkart flipkart) {
		entityTransaction.begin();
		entityManager.remove(flipkart);
		entityTransaction.commit();
	}
	
	public Flipkart getFlipkart(int id) {
		entityTransaction.begin();
		Flipkart obj = entityManager.find(Flipkart.class, id);
		entityTransaction.commit();
		return obj;
	}
	
	public void deleteflipkart1(int id) {
		Flipkart flipkart = entityManager.find(Flipkart.class, id);
		entityTransaction.begin();
		if (flipkart != null) {
			entityManager.remove(flipkart);
			entityTransaction.commit();
		} else {
			System.out.println("wrong id");
		}
	}
	
	
	

}

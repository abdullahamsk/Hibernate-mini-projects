package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import orj.jsp.dto.Customer;

public class Product_dao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abc");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	 public void saveCustomer(Customer customer) {
		 entityTransaction.begin();
		 entityManager.persist(customer);
		 entityTransaction.commit();
		
	}

}

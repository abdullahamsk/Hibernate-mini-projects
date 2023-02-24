package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Product_dao;

import orj.jsp.dto.Customer;
import orj.jsp.dto.Product;

public class Customer_product_con {
	public static void main(String[] args) {
		
		
		
		Customer customer=new Customer();
		customer.setAddress("thane");
		customer.setEmail("abby@gmail.com");
		customer.setName("abby");
		
		Customer customer1=new Customer();
		customer.setAddress("miraRoad");
		customer.setEmail("abdul@gmail.com");
		customer.setName("abdul");
		
		
		Product product=new Product();
		product.setName("dell");
		product.setPrice(120000);
		
		Product product1=new Product();
		product1.setName("dell");
		product1.setPrice(120000);
		
		
		List<Product>list=new ArrayList<Product>();
		list.add(product1);
		list.add(product);
		
		customer.setProducts(list);
		customer1.setProducts(list);
		
		Product_dao dao=new Product_dao();
		dao.saveCustomer(customer);
		dao.saveCustomer(customer1);
	
	
	}

}

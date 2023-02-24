package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;
import org.jsp.dao.flipkart_dao;
import org.jsp.dto.Flipkart;
import org.jsp.dto.Item;  class FlipkartController {
	public static void main(String[] args) {
		
		Flipkart flipkart = new Flipkart();
		//flipkart.setId(1);
		flipkart.setName("abdullah");
		flipkart.setAddress("thane");

		Item item = new Item();
		//item.setId(100);
		item.setProduct("shoes");
		item.setPrice(10000);
		item.setBrand("puma");

		Item item2 = new Item();
		//item2.setId(200);
		item2.setProduct("pant");
		item2.setPrice(10000);
		item2.setBrand("fsfs");

	

		List<Item> list = new ArrayList<>();
		list.add(item);
		list.add(item2);

		flipkart.setItems(list);

		flipkart_dao dao = new flipkart_dao();
//		dao.saveflipkart(flipkart); 
//		
//		Flipkart flipkart2 = dao.getFlipkart(10);
//		
//		dao.deleteflipkart(flipkart2);
		dao.deleteflipkart1(1);
		
		
		

	}

}

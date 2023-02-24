package org.jsp.Bike;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;

@Entity
@Table
public class Bike {
	@Id
	private int id;
	private String name;
	private String color;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.setId(101);
		bike.setColor("black");
		bike.setName("pulsur");
		bike.setPrice(98000);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = manager.getTransaction();

		entityTransaction.begin();
		manager.persist(bike);
		entityTransaction.commit();

		 entityTransaction.begin();
		 manager.merge(bike); 
		 entityTransaction.commit();

		Bike bike2 = manager.find(Bike.class, 101);
		System.out.println(bike2);

		Bike bike3 = manager.find(Bike.class, 103);
		entityTransaction.begin();

		if (bike3 != null) {
			manager.remove(bike3);
			entityTransaction.commit();

		} else {
			System.out.println("id not found");
		}

		Query query = manager.createQuery("select b from Bike  b");
		List<Bike> list = query.getResultList();
		System.out.println(list);
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}

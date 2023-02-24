package org.jsp.Car;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table
public class Car {
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
		Car car = new Car();
		car.setId(104);
		car.setColor("White");
		car.setName("honda");
		car.setPrice(1500000);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = manager.getTransaction();

		entityTransaction.begin();
		manager.persist(car);
		entityTransaction.commit();
	}
}

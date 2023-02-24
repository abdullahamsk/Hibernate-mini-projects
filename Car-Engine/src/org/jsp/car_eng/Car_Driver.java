package org.jsp.car_eng;

public class Car_Driver {
	public static void main(String[] args) {
		Car car = new Car(101,"nano",30000, "black");
		System.out.println(car);
		System.out.println(car.e);
		car.carDetails();
		System.out.println("========================");
		car.e.engineDetails();
	}

}

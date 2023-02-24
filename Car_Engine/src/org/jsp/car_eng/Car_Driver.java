package org.jsp.car_eng;

public class Car_Driver {
	public static void main(String[] args) {
		// Car car=new Car (1001, "laborgini", "red", 800000000);
		 Car car=new Car(new Engine(12, "555cc"), 1001, "laborgini", "red", 800000000);
		 System.out.println(car);
		 System.out.println(car.engine);
		 car.carDetails();
		 System.out.println("=======================");
		 car.engine.engineDetails();
	}
    
     
     
}

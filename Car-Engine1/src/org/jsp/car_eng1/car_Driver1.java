package org.jsp.car_eng1;

public class car_Driver1 {

		public static void main(String[] args) {
			Car1 car = new Car1(new Engine1(1001," 1024cc"), 101, "nano", "red",2000.00);
//			System.out.println(car);
//			System.out.println(car.e1);
			car.carDetails();
//			System.out.println("========================");
//			car.e1.engineDetails();
		}

	}




package org.jsp.car_eng;

public class Car {
	int cid;
	String cname;
	String color;
	double price;

	//Engine engine = new Engine(1001, "1700cc");
	Engine engine;

	public Car(Engine engine, int cid, String cname, String color, double price) {
		
		this.engine=engine;
		this.cid = cid;
		this.cname = cname;
		this.color = color;
		this.price = price;
	}
	
	public void carDetails() {
		System.out.println("Car id is :"+cid);
		System.out.println("Car name is :"+cname);
		System.out.println("Car color is :"+color);
		System.out.println("Car price is :"+price);
		engine.engineDetails();
		
		
		
		
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", color=" + color + ", price=" + price + "]";
	}
	

}

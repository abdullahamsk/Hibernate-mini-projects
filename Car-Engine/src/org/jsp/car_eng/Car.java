package org.jsp.car_eng;

public class Car {
	int cid;
	String cname;
	String color;
	Double price;
	
	//Engine e= new Engine(1001," 1024cc");
	Engine e1;
	
	public Car(Engine e1,int cid, String cname, String color, Double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.color = color;
		this.price = price;
		
		
	}
	public void carDetails() {
		System.out.println("car id is"+cid);
		System.out.println("car name is"+cname);
		System.out.println("car color is"+color);
		System.out.println("car price is"+price);
		e.engineDetails();
		
		
	}
	/*
	 * @Override public String toString() { return "Car [cid=" + cid + ", cname=" +
	 * cname + ", color=" + color + ", price=" + price + "]"; }
	 */
}

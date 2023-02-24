package org.jsp.car_eng1;

public class Car1 {

	int cid;
	String cname;
	String color;
	Double price;

	// Engine e= new Engine(1001," 1024cc");
	Engine1 e1;

	public Car1(Engine1 e1, int cid, String cname, String color, Double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.color = color;
		this.price = price;
		this.e1=e1;

	}

	public void carDetails() {
		System.out.println("car id is" + cid);
		System.out.println("car name is " + cname);
		System.out.println("car color is " + color);
		System.out.println("car price is " + price);
		e1.engineDetails();

	}
//		
//		  @Override 
//		  public String toString() { return "Car [cid=" + cid + ", cname=" +
//		  cname + ", color=" + color + ", price=" + price + "]"; }

}

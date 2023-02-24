package org.jsp.car_eng;

public class Engine {
	int eid;
	String cc;
	public Engine(int eid, String cc) {
		super();
		this.eid = eid;
		this.cc = cc;
	} 
	public void engineDetails() {
		System.out.println("enggine id is"+eid);
		System.out.println("engine cc"+cc);
		
	}
	/*
	 * @Override public String toString() { return "Engine [eid=" + eid + ", cc=" +
	 * cc + "]"; }
	 */

}

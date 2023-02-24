package org.jsp.car_eng1;

public class Engine1 {
	
		int eid;
		String cc;
		public Engine1(int eid, String cc) {
			super();
			this.eid = eid;
			this.cc = cc;
		} 
		public void engineDetails() {
			System.out.println("engine id is "+eid);
			System.out.println("engine cc is "+cc);
			
		}
		
//		 @Override
//		 public String toString() { return "Engine [eid=" + eid + ", cc=" +
//		  cc + "]"; }
		 

	}




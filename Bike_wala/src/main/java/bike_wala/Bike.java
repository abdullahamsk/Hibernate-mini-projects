package bike_wala;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	private int Id;
	private String Name;
	private String Color;
	private String Price;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	
	
	
	public static void main(String[] args) {
		
		
		 
	}
}

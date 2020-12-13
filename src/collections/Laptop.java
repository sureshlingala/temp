package collections;

public class Laptop implements Comparable<Laptop>{
	
	String model;
	int ram;
	int price;
	
	public Laptop(String model, int ram, int price) {
		super();
		this.model = model;
		this.ram = ram;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", ram=" + ram + ", price=" + price + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Laptop L2) {
		//CompareTo will holds default object -> and the values will be called using this keyword
		//and L2 is one more object created for Laptop
	//Sorting based on prices
//		if(this.price>L2.price)
//			return 1;
//		return -1;
		
		return this.price>L2.price?1:-1; // using ternary operation
		
//		if(this.model.compareTo(L2.model)>0){ // Comparision using Strings
//			return 1;
//		}
//		else
//			return -1;
//		
					
					
	}
}

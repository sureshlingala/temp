
public class Animal {

	public String name;
	public int legs;
	
	Animal(String name, int legs){
		this.name=name;
		this.legs=legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void eat(){
		System.out.println("parent eat method is called"); 
	
	}

}

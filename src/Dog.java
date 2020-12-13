
public class Dog extends Animal{
	
	public int teeth;
	public String skin;
	
	Dog(String name, int legs, int teeth, String skin) {
		super(name, legs);
		this.teeth=teeth;
		this.skin= skin;
	}
	
	@Override //overrides the parent class method
	public void eat(){
		System.out.println("Dog class eat method called"); //this msg will be printed calling this method in main using dog object reference 
		super.eat(); //to print the msg in parent class method should call method with super keywords
		
	}

}

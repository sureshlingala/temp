package ImpPrograms;

import java.util.HashMap;

public class HashCodeAndEqual {

	public static void main(String[] args) {
		
		HashMap<fruit, Integer> hm = new HashMap<>();
		hm.put(new fruit("Banana",20), 20);
		hm.put(new fruit("Orange",50), 50);
		hm.put(new fruit("Apple",100), 100);
		
		fruit fobj = new fruit("Banana", 20);
		System.out.println(fobj.hashCodeMethod());
		System.out.println(hm.get(fobj));
		
	}

}

class fruit{

	int price;
	String fruitName;
	
	//note: hashcode method also can be generated from source
	public int hashCodeMethod(){
		System.out.println("In hashcode");
		int hashCode = 0;
		hashCode += price*20;
		hashCode +=fruitName.hashCode(); //hashcode method available on fruitname variable
		return hashCode;
		
	}
	
	public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof fruit) {
        	fruit pp = (fruit) obj;
            return (pp.fruitName.equals(this.fruitName) && pp.price == this.price);
        } else {
            return false;
        }
    }
	
	public fruit(String fruitName, int price) {
		super();
		this.price = price;
		this.fruitName = fruitName;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

} 

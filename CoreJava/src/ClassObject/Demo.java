package ClassObject;

import java.util.Objects;
// this file is use for the  equals() and tostring() method to identity the object convert to the name  	
class Laptop
{
	String model;
	int price;
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}
	/*public String toString() {
	return "HEY";
}*/
	//public boolean equals(Laptop others) 
	//{
	//	if(((this.model.equals(others.model )) && (this.price == others.price)))
	//		return true;
	//	else
	//		return false;
	//}
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
}
  

public class Demo {

	public static void main(String[] args) {
       
		Laptop obj = new Laptop();
		obj.model ="Lenova";
		obj.price = 1000;
		//System.out.println(obj.toString()); //implicit it will call the tostring() method if we dont call 
		//System.out.println(obj); //implicit it will call the tostring() method if we dont call same us above
		System.out.println(obj.toString()); 
		Laptop obj2 = new Laptop();
		obj2.model ="Lenova";
		obj2.price = 1000;
		//boolean result = obj==obj2;
		boolean result = obj.equals(obj2) ;
		System.out.println(result);
	}

}

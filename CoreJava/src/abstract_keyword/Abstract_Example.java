package abstract_keyword;

abstract class Car
{
  abstract public void drive();  // abstract class
  abstract public void fly(); 
//  {
//	 // System.out.println(" in drive mode");
//  }
  public void playMusic()
  {
	  System.out.println(" play music");
  }
}

abstract class WargonG extends Car
{
	public void drive() 
	{
		System.out.println(" in drive mode");
	}
}

class UpdateWargonG extends WargonG
{
	public void fly()  // Concrete class
	{
	System.out.println(" in fly ");	
	}
	
}

public class Abstract_Example 
{
	public static void main(String[] args) {
		
		Car obj = new UpdateWargonG(); // we cannot enstatance the abstract class need to get a class that implement s all the class all method
		obj.drive();
		obj.playMusic();
		obj.fly();
	}

}

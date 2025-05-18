package downcasting_upcasting;

class A
{
  public void show() 
  {	
	  System.out.println("in show A ");
  }
}

class B extends  A
{
	public void show1() 
	{	
		System.out.println("in show B ");
	}
}

public class TypeCasting 
{

	public static void main(String[] args) {
	 //type casting 	
	double num = 5.5;
	int num3 = (int)num;
	System.out.println(num3);
	
	//A obj = (A) new B(); //boxing
	A obj = new B();    //child to parent up casting
	obj.show();
	
	B obj1 = (B) obj;  // parent to child is called  downcasting  
	obj1.show1();

	}

}

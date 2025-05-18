package inner_classes;

class A
{
	int age ;
	
	public void show() 
	{
		System.out.println("show in A");
	}

	class B 
	{
		public void config() 
		{
			System.out.println("show in B");
		}
	}
	static class C 
	{
		public void config1() 
		{
			System.out.println("show in config C");
		}
	}
}

public class Inner_Classes 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		A.B obj1 = obj.new B(); // used the inner class of the object 
		obj.show();
		obj1.config();
		A.C obj2 = new A.C();
		obj2.config1();
		
	}
}

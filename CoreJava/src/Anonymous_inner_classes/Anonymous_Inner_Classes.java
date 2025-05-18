package Anonymous_inner_classes;

abstract class A
{
 abstract public void show();
 abstract public void config();
}


public class Anonymous_Inner_Classes {

	public static void main(String[] args) 
	{
		A obj = new A()
		{
			public void show() 
			{
				System.out.println("show in B");
			}
			public void config() 
			{
				System.out.println("show in Config ");
			}
		}
		;
		obj.show();
		obj.config();
		
	}

}

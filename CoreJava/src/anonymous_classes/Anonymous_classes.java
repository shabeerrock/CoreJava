package anonymous_classes;

class A
{
	public void show() 
	{
		System.out.println("show in A");
	}
}
// for single time use we wont use the extends the classes
//class B extends A 
//{
//	public void show() 
//	{
//		System.out.println("show in B");
//	}
//}

public class Anonymous_classes {

	public static void main(String[] args) {
		A obj = new A()
		{
			public void show() 
			{
				System.out.println("show in B");
			}
		}
		;
		obj.show();

	}

}

package annotation_Example;

class A
{
	public void show() 
	{
		System.out.println("in A");
	}
}

class B extends A
{
	@Override
	public void show() 
	{
		System.out.println("in B");
	}
}

public class Annoation_Demo 
{
	public static void main(String[] args) 
	{
		A obj = new B();
		obj.show();
	}
}

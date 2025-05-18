package samplepackage.calculation.accessmodifer.Polymorphism;

class A 
{
	public void show() 
	{
		System.out.println("in A show");	
	}
}
class B extends A
{
	public void show() 
	{
		System.out.println("in B show");	
	}
}
class C extends A
{
	public void show() 
	{
		System.out.println("in C show");	
	}
}


public class PolymorhismExample {

	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		// only child have the obj of the parent variable
		// A  obj its parent class its call the method if refernce object is reference to the child class then its called and its show this behaviours 
		//this call polymophism this method called Dynamic method Dispatcher it will know at the run time is called polymorphism.
		obj = new B();
		obj.show();
		
		obj = new C();
		obj.show();

	}

}

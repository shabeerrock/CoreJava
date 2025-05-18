package interface_example1;



interface A
{
	int age =44 ;
	String name = "sam";
	abstract public void show();
	abstract public void config();
}
interface X
{
	void run();
}

class B implements A,X
{
	@Override
	public void show() 
	{
		System.out.println("in show B");
	}

	@Override
	public void config() 
	{
		System.out.println("in show config");
	}

	@Override
	public void run() {
		System.out.println("Running ");
		
	}
}

public class InterfaceDemo {

	public static void main(String[] args) 
	{
		A obj ;
		obj = new B();
		obj.show();
		obj.config();
		
		X obj1 = new B();
		obj1.run();
		System.out.println(A.name);
		System.out.println(A.age);
	}

}

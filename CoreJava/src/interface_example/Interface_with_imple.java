package interface_example;

interface  Computer1
{
	void code();
}

class Developer1
{
	public void devApp(Computer1 Lap)
	{
		Lap.code();
	}
}
class Laptop1 implements Computer1
{
	public void code()
	{
		System.out.println("Codeing in laptop");
	}
}

class Desktop1 implements Computer1
{
	public void code()
	{
		System.out.println("Codeing in Destop");
	}
}

public class Interface_with_imple {

		public static void main(String[] args) 
		{
			Developer1 obj = new Developer1();
			Laptop1	 lap = new Laptop1();
			Desktop1	 desk = new Desktop1();
			obj.devApp(lap);
		}

}

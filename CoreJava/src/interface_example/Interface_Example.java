package interface_example;

class Computer
{
	public void code()
	{
		
	}
}

class Developer
{
//	public void devApp()
//	{
//		System.out.println("Coding");
//	}
	
	public void devApp(Computer Lap)
	{
		Lap.code();
	}
}
class Laptop extends Computer
{
	public void code()
	{
		System.out.println("Codeing in laptop");
	}
}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("Codeing in Destop");
	}
}
public class Interface_Example {

	public static void main(String[] args) 
	{
		Developer obj = new Developer();
		Laptop	 lap = new Laptop();
		Desktop	 desk = new Desktop();
		obj.devApp(desk);
	}

}

package enum_example;

enum Laptop1
{
	Macbook(2000),Lenova,Asus(1000),Acer(850);
	private int price; 
	
	private Laptop1(int price) 
	{
		this.price = price;
	}

	private Laptop1() 
	{
		this.price = 5000;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}
}

public class EnumDemo2 
{
	public static void main(String[] args) 
	{
		Laptop1 lap = Laptop1.Macbook;
		Laptop1[] lapArr = Laptop1.values();
		System.out.println(lap);
		System.out.println(lap.getPrice());
		for (Laptop1 res : lapArr )
		{
			System.out.println("Laptop - "+res+ ":"+res.getPrice());
		}
	}
}

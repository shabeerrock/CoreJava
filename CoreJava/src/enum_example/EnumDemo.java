package enum_example;

enum Laptop
{
  Runable,Fail,Pending,Sucess;	
}

public class EnumDemo 
{
	public static void main(String[] args) 
	{
		Laptop lap = Laptop.Fail;
		System.out.println(lap);
		System.out.println(lap.Runable);
		System.out.println(lap.ordinal());
		/*Laptop[] lapArr =  Laptop.values();
		for(Laptop s:lapArr)
		{
			System.out.println("Sl.no"+s.ordinal()+"name"+s +"-"+s.getClass().getName());
		}
		*/
		if(lap==Laptop.Runable)
			System.out.println("in runabale");
		else if (lap==Laptop.Fail)
			System.out.println("in fail");
		else if (lap==Laptop.Pending)
			System.out.println("in pending");
		else
			System.out.println("Done ");
		
		switch(lap)
		{
		case Runable :
			System.out.println("in runnable");
			break;
		case Fail :
			System.out.println("in Fail");
			break;
		case Pending:
			System.out.println("pending");
			break;
		default:
			System.out.println("done");
			break;
		}
	}
}

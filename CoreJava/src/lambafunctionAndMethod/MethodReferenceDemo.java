package lambafunctionAndMethod;

@FunctionalInterface
interface a
{
 void singleAbsMethod();	
}

public class MethodReferenceDemo {

	public static void main(String[] args) 
	{
	 a a1 = Test::check;
	 a1.singleAbsMethod();
	 a a2 = ()->System.out.println("checking");
	 a2.singleAbsMethod();
	}

}

class Test
{
	public static void check()
	{
		System.out.println("myname ");
	}

}

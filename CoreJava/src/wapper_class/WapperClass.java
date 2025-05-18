package wapper_class;

public class WapperClass 
{
	public static void main(String[] args) 
	{
		int num = 7;
		///Integer num1 =  new Integer(8); //deprecated method boxing
		Integer num1 =  num; // auto boxing 
		
		//primitive to object  
		System.out.println(num1);
		//object to primitive Type
		//int num2 = num1.intValue(); //unboxing 
		int num2 = num1; //Auto unboxing 
		System.out.println(num2);
		//String a number convert into number int
		String str = "30";
		int num3 =  Integer.parseInt(str);
		System.out.println(num3);
		System.out.println(num3*2);
	}

}

package lambafunctionAndMethod;
@FunctionalInterface
interface parse
{
   String parser(String s);	
}

class StringPrase
{
      public static String convert(String s)
      {
    	  if(s.length() <= 3)
    		  s=s.toLowerCase();
    	  else
    		  s=s.toUpperCase();
    	  return s;
      }
}

class printshow
{
   public void map(String s,parse p)
   {
	String str = p.parser(s); 
	System.out.println(str);
   }
}

public class MyprinterExampleTel {

	public static void main(String[] args) {
		String str = "Shabeer";
		printshow printshow1 = new printshow();
		printshow1.map(str,new parse()
		{
			public String parser(String s)
			{
				return StringPrase.convert(s);
			}
		});
		
		//convert lamba 
		printshow1.map(str,s -> StringPrase.convert(s));
		//method reference
		printshow1.map(str,StringPrase :: convert);
		
			
		

	}

}

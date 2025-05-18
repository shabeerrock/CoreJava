package overriding;
class Calu //parent class
{
  public int add(int a,int b) 
  {
	  System.out.println("in calu class");
	  return a+b;
  }
  public void config(int c, int d,int e) 
  {
	  System.out.println("in  calu config");
  }
}

class AdvCalu extends Calu //child class
{
  public int add(int a,int b) //overriding the parent class first call the child if is not then goes to the parent class 
  {
	  //System.out.println("in calu class");
	  return a+b+1;
  }
  public void config(int c, int d,int e,int f) // function overloading
  {
	  System.out.println("in  adv config");
  }
}

public class OverridingandOverloading 
{
	public static void main(String[] args) 
	{
	  AdvCalu obj = new AdvCalu();
	  int result = obj.add(3, 4); 
	  System.out.println(result);
	  obj.config(1, 2, 3);
	}
}

package FinalExample;

 //final class Calu //the type AdvCalu cannot subclass the final class Calu
 class Calu
{
//	 public final void show()  // method exapmle
	 //{
//			System.out.println("in shabeer"); 
//		 }
	 public  void show() {
		System.out.println("in shabeer"); 
	 }
	 public void add(int a ,int b) {
		 System.out.println(a+b); 
	 }
}
class AdvCalu extends Calu // final class in class the type AdvCalu cannot subclass the final class Calu, if you final in class stop to inhertances
{
	 public void show()  //final method example No oveerride method we can stop the override the method make method is final cannot override the method
	 {
			System.out.println("in shabeer"); 
	 }
}


public class Finalexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int marks = 5; //final   variable
		//marks = 10;
		System.out.println(marks);
		
		AdvCalu obj = new AdvCalu();
		obj.show();
		obj.add(5,5);

	}

}

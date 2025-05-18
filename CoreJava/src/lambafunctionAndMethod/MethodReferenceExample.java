//package lambafunctionAndMethod;
//
//import java.util.Arrays;
//import java.util.List;
//
//
//interface A
//{
//	void addmethod(String a);	
//}
//class Test
//{
// public static void addmethod(String a)
// {
//	 System.out.println("implementaion class : "+a);
// }
// public static void show(String a)
// {
//	 System.out.println("implementaion class");
// }
//}
//
//
//public class MethodReferenceExample {
//
//	public static void main(String[] args) {
//	 List<String> name = Arrays.asList("SHABEER");
//	 A a = new A() 
//	 		{
//				public void addmethod(String a )
//				{
//				 System.out.println(a.toLowerCase());	
//				}
//	 		};
//	 a.addmethod(name.get(0));	
//	 //Setep 2:
//	 //convert in Lamba function
//	 A a1 = b -> System.out.println(b.toLowerCase());
//	 a1.addmethod(name.get(0));	
//	 //Setup 3 : method reference ///Instance Method Reference (specific object)
//	 A a3 = System.out :: println; 
//	 a3.addmethod(name.get(0));
//	 //Setup 4 : method refernce in implementation
//	 A a4 = Test :: addmethod;
//	 a4.addmethod("sam");
//	 A a5 = Test :: show;
//	 a4.addmethod("sam");
//					 
//	}
//
//}

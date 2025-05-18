package stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("sam","gopi","shabeer");
		//Print the list 
		//		name.forEach(n->System.out.println(n));
		//setup 1:
//		Consumer<String> con = new Consumer <String>() 
//		{
//			public void accept(String n) 
//			{
//				System.out.println(n.toUpperCase());
//			}
//		};
		//Setup 3 :
		Consumer<String> con = n -> System.out.println(n.toUpperCase());
		name.forEach(con);
		//int sum = 0;
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		int[] sum = {0};
		//Step 1:
//		Consumer<Integer> sumcon = new Consumer<Integer>() 
//		{
//			public void accept(Integer n)
//			{
//				sum[0] = sum[0]+n;
//			}
//		};
//		number.forEach(sumcon);
		//step 2 : 
		number.forEach(n -> sum[0] = sum[0]+n);		
		System.out.println("SUM in lamba method :"+sum[0]);
       //using atomic integer sum and get 		
		List<Integer> number1 = Arrays.asList(1,2,3,4,5,6,7,8);
		AtomicInteger sumAtomic = new AtomicInteger();
		number1.forEach(t -> sumAtomic.addAndGet(t) );
		System.out.println("Atomic Sum :"+sumAtomic.get() );
	}
}

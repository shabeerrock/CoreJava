package foreachloop;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(4,5,6,7,8,9);
		int sums =0;
	//	int n =0;
//		
//		for(int i=0 ;i<nums.size();i++ )
//		{
//			if(nums.get(i)%2 == 0)
//			{
//				n = nums.get(i) *2;
//				sums +=n;
//			}
//		}
		//for loop enchance loop
//		for (int t : nums)
//		{
//			if(t%2 ==0)
//			{	
//				t *=2;
//				sums+=t;
//			}	
//		}
		//
		//for each loop //before after changes 
//		Consumer <Integer> con = new Consumer<Integer>()
//		{
//			public void accept(Integer n)
//			{
//				System.out.println(n);
//			}
//		};
//		nums.forEach(con);
		//step : 2
//		Consumer <Integer> con = n ->System.out.println(n);
//		nums.forEach(con);
		//Setp : 3
		nums.forEach(n-> System.out.println(n));
		
		
		System.out.println("value of sum"+sums);
		System.out.println("size()"+nums.size());
		
		
	}

}

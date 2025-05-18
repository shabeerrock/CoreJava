package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.*;

/*
 * 1)how to create the stream 
 * 2)config the stream 
 * 3)fliter 
 * 4)map
 * 5)count
 * 6)sort - ASC and Desc
 * 7)min()
 * 8)max()
 * 9)toArary()
 * 10)stream of()
 */

public class StreamCodeDecode1 {

	public static void main(String[] args) 
	{
		
		List<Integer> aryList = Arrays.asList(5,25,20);
		//create a stream 
		Stream<Integer> aryStream =aryList.stream();
		//configuration the stream 
		Stream<Integer> aryfilter = aryStream.filter(x-> x>10);
		//processing the stream 
//		List<Integer> inAList = aryfilter.collect(Collectors.toList());
	//	System.out.println(inAList);
		//line forloop
		aryfilter.forEach(y->System.out.println(y));
		System.out.println("In single line");
		aryList.stream().filter(a->a>4).forEach( a -> System.out.println(a));
		
		System.out.println("------------Map---------");
		//4)Map
		aryList.stream().map(a->a*2).forEach(System.out::println);
		//5)count
		System.out.println("------------Count---------");
		long i =  aryList.stream().filter(a->a>5).count();
		System.out.println(i);
		System.out.println("------------without intermidate operator");
		//without intermideate operator
		System.out.println(aryList.stream().count());
		System.out.println("--------------Sort-------------------------");
		//sort
		aryList.stream().sorted().forEach(a-> System.out.println(a));
		System.out.println("--------------desc Sort-------------------------");
		//descending order
		aryList.stream().sorted((a,b)-> b.compareTo(a)).forEach(a->System.out.println(a));
		System.out.println("--------------ASC Sort-------------------------");
		aryList.stream().sorted((a,b)-> a.compareTo(b)).forEach(a->System.out.println(a));
		System.out.println("--------------MIN-------------------------");
		System.out.println(aryList.stream().min((a,b)-> a.compareTo(b))); // return in option class
		Optional <Integer> minVal= aryList.stream().min((a,b)-> a.compareTo(b));
		System.out.println(minVal.get());
		System.out.println("--------------MAX-------------------------");
		Optional <Integer> maxVal = aryList.stream().max((a,b)->a.compareTo(b));
		System.out.println(maxVal.get());
		System.out.println("--------------to Array-------------------------");
		System.out.println(aryList);
		Object[] a =aryList.stream().toArray();
		System.out.println(Arrays.toString(a));
		for(Object o: a)
		{
			System.out.println(o);
		}
		System.out.println("--------------stream to-------Stream from an array------------------");
		System.out.println("Stream from an array");
		String[] strArary = {"shabeer","sam","gopi"};
		Stream<String> stringStream = Stream.of(strArary);
		stringStream.filter(s->s.length()>=4).forEach(f->System.out.println(f));
		System.out.println("Example 2");
		Stream.of(1,2,3,4,5,6,7).forEach(x->System.out.println(x));
		System.out.println("Stream forEach");
		aryList.stream().forEach(z -> System.out.println("hello"));
		
		
		
		
		
		
	}

}

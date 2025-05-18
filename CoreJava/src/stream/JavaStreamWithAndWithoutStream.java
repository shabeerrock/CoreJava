package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamWithAndWithoutStream {

	public static void main(String[] args) 
	{
		System.out.println("##############without stream #################");
		List<Integer> arlist =  Arrays.asList(5,75,35);
		List<Integer> newList = findElenment(arlist);
		for(Integer n :  newList )
		{
			System.out.println(n);
		}	
		System.out.println("##############with stream #################");
		//List<Integer> streamList = new ArrayList(); 
		List<Integer> streamList = arlist.stream().filter(n->n>5).collect(Collectors.toList());
		System.out.println(streamList);
		streamList.stream().forEach(b->System.out.println(b));
	}
	public static List<Integer> findElenment(List<Integer> list1)
	{
		List<Integer> newArrayList = new ArrayList<Integer>();
		for(Integer i : list1)
		{
			if(i >5)
				newArrayList.add(i);
		}
		System.out.println(newArrayList);
		return newArrayList;
	}

}

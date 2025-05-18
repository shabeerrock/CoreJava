package hashmap_example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingMap {

	public static void main(String[] args) {
		String[] names = {"john","sam","shabeer","mohab"};
		
		Map<Integer,String> name = new  HashMap <Integer,String>();
		List<String> nameList = new  ArrayList<String>();
		for(int i = 0 ;i<names.length ;i++)
		{
			name.put(i, names[i]);
		}
		System.out.println(name.values());
		Collection<String> values = name.values();
		System.out.println("checking name : "+name);
		System.out.println("checking name 1 : "+name.entrySet()); //[0=john, 1=sam, 2=shabeer, 3=mohab]
		
		
		Map<String,Integer> student = new  HashMap <String,Integer>();
		student.put("Shabeer",15);
		student.put("Sam",12);
		student.put("madhan",10);
		student.put("shahul",5);
		student.put("gopi",9);
		student.put("gopi",2); //it map will replace the value gopi  [Sam, Shabeer, john, madhan, shahul]
//		student.put(null, null);
//		student.put("Sandesh", null); //show  Cannot read field "value" because "anotherInteger" is null
		List<Integer>  lista = new ArrayList<Integer>();
		System.out.println(student);
		System.out.println("hashmap size : "+student.size());
		
		for(Object key : student.keySet())
		{
		  System.out.println("key and values checking : "+student.get(key));	
		  lista.add(student.get(key));
		}
		
		Collections.sort(lista);
		System.out.println(lista);
		//System.out.println(student);

	}

}

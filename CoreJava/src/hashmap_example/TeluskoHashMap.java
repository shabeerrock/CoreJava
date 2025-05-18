package hashmap_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeluskoHashMap {

	public static void main(String[] args) {
		Map<Integer,String> student = new  HashMap <Integer,String>();
		student.put(1,"Shabeer");
		student.put(2,"Sam");
		student.put(3,"madhan");
		student.put(4,"shahul");
		student.put(5,"gopi");
		student.put(5,"john"); //it map will replace the value gopi  [Sam, Shabeer, john, madhan, shahul]
		List<String>  lista = new ArrayList<String>();
		System.out.println(student);
		
		for(Object key : student.keySet())
		{
		  System.out.println("key and values checking : "+student.get(key));	
		  lista.add(student.get(key));
		}
		
		Collections.sort(lista);
		System.out.println(lista);
		
	}

}

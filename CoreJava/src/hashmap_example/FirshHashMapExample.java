package hashmap_example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FirshHashMapExample {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> nameMap = new HashMap<String,Integer>();
		nameMap.put("sam", 1000);
		nameMap.put("shabeer", 800);
		nameMap.put("gopi", 700);
		nameMap.put("madhan", 500);
	     
		System.out.println("what is in hashmap checking"+nameMap); //{gopi=700, madhan=500, shabeer=800, sam=1000}
		// set Declared
		Set nameSet = nameMap.keySet();
		System.out.println("set value "+nameSet); //set value [gopi, madhan, shabeer, sam]
		Iterator itername = nameSet.iterator();
		while(itername.hasNext())
		{
			Object nameitr =  itername.next();
			System.out.println("key show :"+ nameMap.get(nameitr) );
		}
		System.out.println("the contain value of value :"+ nameMap.containsKey("gopi") );//true 
		System.out.println("the contain value of value :"+ nameMap.containsKey("AAA") );//false
		System.out.println("the cointain key "+nameMap.containsValue(800)); //true
		System.out.println("the cointain key "+nameMap.containsValue(12000)); //false
		System.out.println("Remove a element in the map "+ nameMap.remove("madhan") );
		System.out.println("Final result:"+nameMap); // Final result:{gopi=700, shabeer=800, sam=1000}
		
		
		
	}

}

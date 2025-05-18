package samplepackage;

import samplepackage.calculation.*;

public class examplePackage {

	public static void main(String[] args) 
	{
		AdvCalu obj = new AdvCalu();
		Calu obj1 = new Calu();
		int result = obj.sub(3,4);
		int result1 = obj1.mult(3,4);
		System.out.println(result);
		System.out.println(result1);
	}

}

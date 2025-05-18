package samplepackage.calculation.accessmodifer;

import samplepackage.calculation.*;

class C extends ProctecedAc 
{
	public void demo() 
	{
		System.out.println(number);
	}
}

public class PublicExample {
	private static int snlno = 10;
   
	public static void main(String[] args) 
	{
		PublicAc obj = new	PublicAc();
		System.out.println(obj.marks); // it will visiable because its in different packages need to add public in instance variable
		obj.show();
		PublicSample obj1 = new	PublicSample();
		System.out.println(obj1.marks); // it will visable because its in different packages no need add public beacuse its in same package(called as default class)
	     
		//A obj2 = new A();
		System.out.println(snlno ); // private class
		//below used for the proteced class/////
		C obj3 = new C();
		//System.out.println(obj3.number); // it will not work in same protected we can use in subclass from drived class 
		obj3.demo();
	}

}

package Predicate;

import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) 
	{
      PredicateFunction  predicate = new PredicateFunction();
       //predicate.testStringLength("SHAB");
      System.out.println(" check the value in predicate return : "+ predicate.testStringLength("SHABEER"));
      
      //1)function interface find the greatest number 
      Predicate<String> checkstring = s-> s.length() > 5;
      System.out.println(" in predicate fuction "+ checkstring.test("SHAB"));
      
      //2)check the number is postive are negative 
      Predicate<Integer> checkNumber =  n -> n > 0; 
      int number = -11;
      String checkValue = (checkNumber.test(number)) ? "POSTIVE" : "NEGATIVE";
      System.out.println(" given "+number+" value is postive OR Negative ANSWER : "+checkValue);
      
      //3)Check if a string is empty
      
      Predicate<String> checkStringEmpty = CSE -> CSE.equals("");
      String name = "";
      String nameResult = ( checkStringEmpty.test(name))? "IS EMPTY" : "IS NOT EMPTY" ; 
      System.out.println(" the given String is : "+nameResult);
      
      //4)Check if a number is even
      Predicate<Integer> evenNumber = en -> en%2==0;
      int evenNumberValue = 3 ;
      String evenNumberResult = ( evenNumber.test(evenNumberValue))? " is even " : "  not even" ;
      System.out.println(" the given number "+evenNumberValue+" : "+evenNumberResult);
      
      //5)Check if a string starts with a capital letter
      Predicate<String> checkFirstLetter = fl-> Character.isUpperCase(fl.charAt(0));
      String letterValue =  "shabeer";
      String checkFirstLetterValue = ( checkFirstLetter.test(letterValue))? " IS Uppercase"  : " is not in upper case" ;
      System.out.println("the value given for the first letter  ::"+checkFirstLetterValue);

      //6)Use Predicate in a method
      //Predicate<Integer> greaterthan100 
      Predicate<Integer> gratherthan100 = x-> x > 100;
      int greathanValue = 200;
      String greathanValueResult = (checkGreather(greathanValue,gratherthan100))? " is greather " : " is not greather" ;
      System.out.println("the result greater than "+ greathanValueResult);
      
      //predicate join using (and)
      Predicate<Integer> evenAndGather = evenNumber.and(gratherthan100);
      int evenAndGatherValue = 30;
      String evenAndGatherValueResult = (evenAndGather.test(evenAndGatherValue))?"is even and greather": " id not even and greather" ;
      System.out.println("The result "+evenAndGatherValueResult);
      
    //predicate join using (OR)
      Predicate<Integer> divisiableBy5 = db5 -> db5%5==0;
      Predicate<Integer> combinastion =  evenNumber.or(divisiableBy5);
      int evenanddivdeValue = 7;
      String evenanddivdeResult = ( combinastion.test(evenanddivdeValue) )? " even or divisable by 5 " : "even Not divisable by 5" ;
      System.out.println("the even or divide result "+evenanddivdeResult);

     //Negate in java
      Predicate<String> nameStart = nsw -> nsw.startsWith("A");
      Predicate<String> viseVersa = nameStart.negate();
      String namewithstart = "SHABEER";
      String namewithstartValue = (viseVersa.test(namewithstart))? " is not start A vise " :" is start A vise " ; 		  
      System.out.println("The Result "+namewithstartValue);
		
      //Predicate.isEqual() — Equality Check
      
      Predicate<String> nameString = Predicate.isEqual(namewithstart) ;
      String nameStringValue = (nameString.test("SHABEER"))?" is equal": "Not equal";
      System.out.println(" the result "+nameStringValue);
      
//      Write a predicate that checks if a number:
//    	  Is positive
//    	  Not divisible by 3
//    	  OR equals 42
      
      Predicate<Integer> notdivide3 = nd3->nd3%3!=0;      
      //Predicate<Integer> combinationtrue = checkNumber.and(notdivide3);
      Predicate<Integer> checkEqual = Predicate.isEqual(42);
      //Predicate<Integer> combination = checkNumber.and(notdivide3).or(checkEqual);

      System.out.println("TEST THE pratice problem checking:"+checkNumber.and(notdivide3).or(checkEqual).test(4));
  
	}
	
   public boolean testStringLength(String value )
   {
	   boolean  result = false ; 
	   result = (value.length()>= 5) ?  true   :  result  ;
	   return result;
   }
	
   public static boolean checkGreather (int n ,Predicate<Integer> condition ) 
   {
	 return condition.test(n);	   
   }
	

}

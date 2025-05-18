package functions;
import java.util.function.*;
public class FunctionExample {

	public static void main(String[] args) 
	{
      //1.Square a number
		Function<Integer,Integer> squareAvalue = n->n*n;	
		int numberSquare = 5 ; 
        System.out.println(" square the given value"+squareAvalue.apply(numberSquare));		
        
      //2. Convert String to Length 
      //Write a function that takes a String and returns its length.
        Function<String,Integer> findStringlength = s->s.length();
        String findStringlengthValue  = "SHABEER";
        System.out.println("find the  String lenght "+findStringlength.apply(findStringlengthValue));
        
      //3.  Convert Celsius to Fahrenheit  
        //Write a function that converts a temperature from Celsius to Fahrenheit. //F = C * 9/5 + 32
        Function<Integer, Integer> convertCelFah = ccf -> (ccf * 9/5)+32;
        int convertCelFahValue = 4;
        System.out.println("the  converts a temperature from Celsius to Fahrenheit :"+convertCelFah.apply(convertCelFahValue));
        
       //4. Function Chaining using andThen() 
        //Write First add 5 to a number, then multiply it by 2
        Function<Integer,Integer> chainingconcept = x->x+5;
        Function<Integer,Integer> chainingConceptAnother = t->t/2;
        int chainingconceptValue = 4;
       // System.out.println("the value for changing "+chainingconcept.andThen(chainingConceptAnother).apply(chainingconceptValue));
        
       //Function Chaining using compose()
       //5.First multiply a number by 2, then add 10
        Function<Integer,Integer> composechain = com->com*2;
        Function<Integer,Integer> composechainadd = a->a+10;
        int composevalue = 10;
        System.out.println("The compose value "+composechainadd.compose(composechain).apply(composevalue));
        
       //6. Extract Domain from Email
       Function<String, String> domainExact = dom -> dom.substring(dom.indexOf("@")+1);
       String email = "shabeer@gmail.com";
       System.out.println("Domain : "+domainExact.apply(email));
       
       //7. Return First Character of String
       Function<String, Character> charater =  cha -> cha.charAt(0);
       System.out.println(" the first charater :"+ charater.apply(findStringlengthValue));
       
       //8. Write a function that takes a string, trims it, converts to uppercase, and returns it.
       Function<String, String> trimString = nam->nam.trim();
       Function<String, String> upperString = upp -> upp.toUpperCase();
       System.out.println("the result : "+trimString.andThen(upperString).apply(" sample ") );
        
        
	}

}

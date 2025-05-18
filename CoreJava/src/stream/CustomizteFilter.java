package stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomizteFilter {

	public static void main(String[] args) 
	{
		Predicate<String> con = s -> s.startsWith("A");
		
		List<String> names = List.of("Alice", "Bob", "Andrew", "Charlie");

		List<String> result = names.stream()
		    .filter(con)  // using your custom predicate
		    .collect(Collectors.toList());

		System.out.println(result);

	}

}

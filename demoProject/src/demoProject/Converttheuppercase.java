package demoProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converttheuppercase {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("java", "sql", "python", "spring", "spring boot");
		
		   List<String> uppercase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		   
		   System.out.println(uppercase);
	}

}

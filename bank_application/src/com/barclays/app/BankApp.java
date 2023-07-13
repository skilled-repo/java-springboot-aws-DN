package com.barclays.app;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankApp {

	public static void main(String[] args) {
		
		 Stream.of("Bald eagle", "pronghorn", "puma", "sea lion")	
		   .collect(Collectors.toSet())
	  	   .stream()
	   	   .collect(Collectors.groupingBy(s -> s.contains(" ")))
	   	   .entrySet()
	       .stream()
	   	   .filter(e -> e.getKey())
	   	   .map(Entry::getValue)
	   	   .flatMap(List::stream)
	       .sorted(Comparator.reverseOrder())
	  	   .forEach(e -> System.out.print(Collectors.joining(", ")));
	  	   
	  	   

	//System.out.println(names);
	}

}

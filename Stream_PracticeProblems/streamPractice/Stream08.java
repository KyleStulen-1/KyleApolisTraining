package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Remove null values from a list
Input: List strings = ["apple", null, "cherry", null, "date"]
Output: ["apple", "cherry", "date"]
 */
public class Stream08 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>(Arrays.asList("apple", null, "banana", null, "cherry", "date", null));
		
		List<String> output = strings.stream().filter(word -> word != null).toList();
		
		List<String> output2 = strings.stream().filter(word -> word != null).collect(Collectors.toList());
		
		List<String> output3 = strings.stream().filter(word -> word != null).collect(Collectors.toCollection(ArrayList::new));
	
		System.out.println("output1: "+ output);
		System.out.println("output2: "+ output2);
		System.out.println("output3: "+ output3);
	}
}

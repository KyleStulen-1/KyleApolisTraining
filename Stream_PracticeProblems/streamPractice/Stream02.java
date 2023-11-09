package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Convert a list of strings to uppercase and sort them in reverse order
Input: List strings = ["apple", "banana", "cherry", "date"]
Output: ["DATE", "CHERRY", "BANANA", "APPLE"]
 */
public class Stream02 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "date"));
		
		List<String> output = strings.stream().map(s -> s.toUpperCase()).sorted(Collections.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(output);
	}
	
	
}

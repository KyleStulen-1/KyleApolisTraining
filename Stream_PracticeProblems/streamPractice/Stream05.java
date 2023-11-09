package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream05 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "date"));
		
		
		//swaping result of Integer.valueOf(a.length()).compareTo(Integer.valueOf(b.length)))
		//sorts largest to smallest instead of smallest to largest
		//first element now longest string
		String output = strings.stream().sorted((a ,b) -> -Integer.compare(a.length(), b.length())).findFirst().get();
		
		System.out.println(output);
	}
}

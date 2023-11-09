package streamPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Count the occurrences of each word in a sentence
Input: String sentence = "Hello world hello"
Output: { "Hello"=2, "world"=1, "hello"=1 }
 */
public class Stream06 {
	
	public static void main(String[] args) {
		String sentence = "Hello world hello world hello";
		
		Map<String, Long> map = Arrays.stream(sentence.split(" "))
				.map(word -> word.toLowerCase())
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html#groupingBy-java.util.function.Function-java.util.stream.Collector-
		//groups by word, then each group has a collector applied to it again
		//{world=[world, world], hello=[hello, hello, hello]} -> {world=2, hello=3}
		System.out.println(map);
	}
	
}

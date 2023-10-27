package collectionsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * How to sort map basis on values ?
Input: { "apple" => 3, "banana" => 7, "cherry" => 1, "date" => 9, "fig" => 5 } Output: { "cherry" => 1, "apple" => 3, "fig" => 5, "banana" => 7, "date" => 9 }
 */
public class Problem04 {
	public static <K, V> void main(String[] args) {
		HashMap<String,Integer> fruitCount = new HashMap<String,Integer>();
		fruitCount.put("apple", 3);
		fruitCount.put("banana", 7);
		fruitCount.put("cherry", 1);
		fruitCount.put("date", 9);
		fruitCount.put("fig", 5);
		
		fruitCount.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue())
			.forEach(System.out::println);
			
		ArrayList<Entry<String,Integer>> list = new ArrayList<>(fruitCount.entrySet());
		list.sort(Map.Entry.comparingByValue());
		System.out.println(list.toString());
		
		LinkedHashMap<String,Integer> linkedMap = new LinkedHashMap<String,Integer>();
		for (Entry<String, Integer> e: list) {
			linkedMap.put(e.getKey(), e.getValue());
		}
		System.out.println(linkedMap.toString());
		
	}
}

package collectionsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
 * Find all duplicate elements in an array.
Input: int[] nums = {1, 2, 3, 2, 1, 3, 4, 5}; Output: [1, 2, 3]
 */
public class Problem02 {
	
	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 2, 1, 3, 4, 5};
		
		Map<Integer, Integer> instancesOf = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < inputArray.length; i++) {
			if (instancesOf.containsKey(inputArray[i])) {
				instancesOf.replace(inputArray[i], instancesOf.get(inputArray[i]) + 1 );
			} else {
				instancesOf.put(inputArray[i], 1);
			}
		}
		
		
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> entry: instancesOf.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.add(entry.getKey());
			}
		}
		
		System.out.println("Duplicates: " + duplicates.toString());
		
	}
}

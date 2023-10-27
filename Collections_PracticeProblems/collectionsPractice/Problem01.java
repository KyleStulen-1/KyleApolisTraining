package collectionsPractice;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, count the occurrences of each integer and store them in a map.
Input: int[] nums = {1, 2, 3, 2, 1, 3, 4, 5}; Output: {1=2, 2=2, 3=2, 4=1, 5=1}
 */

public class Problem01 {
	
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
		
		System.out.println(instancesOf.toString());
	}	
}

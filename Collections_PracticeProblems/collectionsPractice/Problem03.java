package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/*
 *  Iterate collection using list iterator and iterator ? also add and remove elements in list ?
Input: arraylist object - [3, 7, 1, 9, 5] Output: remove 7 and add 10 after 1 - [3,1,10,9,5]
 */

public class Problem03 {
	public static void main(String[] args) {
		ArrayList<Integer> inputArray = new ArrayList<Integer>(Arrays.asList(3, 7, 1, 9, 5));
		
		ListIterator<Integer> inputIterator = inputArray.listIterator();
		
		while(inputIterator.hasNext()) {
			Integer value = inputIterator.next();
			if (value == 7) {
				inputIterator.remove();
			} else if (value == 1) {
				inputIterator.add(10);
			}
		}
		
		System.out.println(inputArray.toString());
	}
}

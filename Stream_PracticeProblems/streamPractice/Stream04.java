package streamPractice;

import java.util.Arrays;

public class Stream04 {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int output = Arrays.stream(numbers).filter(num -> num > 50).sum() / 5;
		
		//want to count the numbers before sum, store that count, then sum, then divide by count 
		
		double output2 = Arrays.stream(numbers).filter(num -> num > 50).average().orElse(0);
		int output3 = (int) Arrays.stream(numbers).filter(num -> num > 50).average().orElse(0);
		
		System.out.println("output1: "+ output);
		System.out.println("output2: "+ output2);
		System.out.println("output3: "+ output3);
	}
}

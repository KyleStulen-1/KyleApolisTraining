package method_reference;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference02 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

        String target = "cherry";

        fruits.stream()
			.filter(target::equals)
			.forEach(fruit -> System.out.println("Found: " + fruit));
        
        //verbose
        fruits.stream()
			.filter((str) -> {
				return target.equals(str);
			})
			.forEach(fruit -> System.out.println("Found: " + fruit));
    }
}

package predicate_and_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        
        
        //another syntax example
        Function<String, String> toUpperCaseVerbose = (str) -> {
        	return str.toUpperCase();
        };

        List<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(toUpperCase.apply(name));
        }

       System.out.println(uppercaseNames);
    }
}

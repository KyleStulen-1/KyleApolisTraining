/**
 * Static Method implementation - 
 * we use a static method from the java.util.stream.Stream interface. 
 * The "of" method creates a stream of strings.
 * @author Heeren
 * @version 1.0
 */
package default_and_static_methods;

import java.util.stream.Stream;

public class StaticMethod02_StreamOf {
    public static void main(String[] args) {
        
    	//The interface Stream has static method of() to create a stream of <Type>
    	//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
    	Stream<String> stream = Stream.of("Alice", "Bob", "Charlie", "David");
        
        long count = stream.filter(s -> s.length() > 4).count();
        System.out.println("Count of names with more than 4 characters: " + count);
    }
}
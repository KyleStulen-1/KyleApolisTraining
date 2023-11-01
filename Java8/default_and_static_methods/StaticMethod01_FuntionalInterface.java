package default_and_static_methods;

import java.util.function.BiFunction;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

public class StaticMethod01_FuntionalInterface {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int result1 = MathOperation.add(x, y);
        int result2 = MathOperation.subtract(x, y);
        
        
        //showing method references to static methods in an interface
        BiFunction<Integer,Integer,Integer> function = MathOperation::add;
        System.out.println( function.apply(2, 2) );
        
        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
    }
}

package a_10_16_2023_static_import_aggregation_composition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class StaticImport {
	
	
	
	public double calculateHypotenuse(double a, double b) {
		return (sqrt(pow(a,2) + pow(b,2)));
	}
	
	public static void main(String args[]) {
		System.out.println("The hypotenuse of right triangle with sides 3 and 4 is: " + new StaticImport().calculateHypotenuse(3, 4));
	}
}

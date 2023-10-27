package stringPractice;

public class Problem17 {
	public static void main(String[] args) {
		String s = "hello";
		String s1 = new StringBuilder(s).reverse().toString();
		
		System.out.println(s1);
	}
}

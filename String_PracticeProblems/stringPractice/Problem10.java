package stringPractice;

/*
 * Convert a String to Uppercase or Lowercase
Write a function that takes a string and a flag indicating uppercase or lowercase conversion, and returns the modified string.

Input: A string, e.g., "Hello", and a flag indicating lowercase Output: Modified string in lowercase, e.g., "hello"
 */

class IncorrectFlagException extends Exception {

	public IncorrectFlagException(String errorMessage) {
		super(errorMessage);
	}
}

public class Problem10 {
	
	static String changeCase(String s, String flag) throws IncorrectFlagException {
		if (flag.equals("upper")) {
			return s.toUpperCase();
		} else if (flag.equals("lower")) {
			return s.toLowerCase();			
		} else {
			throw new IncorrectFlagException("Incorrect Flag: " + flag);
		}
	}
	
	static void changeCaseRunner(String s, String flag) {
		try {
			System.out.println(s + " to " + flag + "case: " + changeCase(s, flag));
		} catch (IncorrectFlagException e) {
			System.out.println("The correct flags are lower and upper");
		}
	}
	
	public static void main(String[] args) {
		changeCaseRunner("hello", "upper");
		changeCaseRunner("This Is An Example Sentance", "lower");
		changeCaseRunner("asdfasdf", "asdfasdf");
		
	}
}

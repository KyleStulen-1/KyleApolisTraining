package method_reference;

@FunctionalInterface
interface MyStringConcatenator {
	String concatenate(String str1, String str2);
}

public class InstanceMethodReference01 {
	public static void main(String[] args) {
		//create an instance of of the ojbject
		InstanceMethodReference01 methodReference = new InstanceMethodReference01();
		//then refer to the method in the object 
		MyStringConcatenator concatenator = methodReference::customConcatenate;

		String result = concatenator.concatenate("Hello, ", "World!");
		System.out.println("Concatenated String: " + result);
		
		//cannot make static reference to non-static method customConcatenate
		//MyStringConcatenator concatenatorTwo = InstanceMethodReference01::customConcatenate;
	}

	public String customConcatenate(String str1, String str2) {
		return str1 + str2;
	}
}

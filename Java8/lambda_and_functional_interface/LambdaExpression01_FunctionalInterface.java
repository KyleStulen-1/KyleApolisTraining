package lambda_and_functional_interface;

@FunctionalInterface
interface CustomInterface {
	void hello();
}

public class LambdaExpression01_FunctionalInterface {
	public static void main(String[] args) {
		CustomInterface object = () -> System.out.println("hello how are you doing?");
		object.hello();
	}
}

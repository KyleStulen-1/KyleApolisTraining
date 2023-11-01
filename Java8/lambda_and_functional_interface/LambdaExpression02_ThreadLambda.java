package lambda_and_functional_interface;

public class LambdaExpression02_ThreadLambda {
    public static void main(String[] args) {
    	//thread objects can be created with lambda expressions
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " Count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}

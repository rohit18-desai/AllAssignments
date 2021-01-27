
public class Calculator {
	
	int a=10;
	static int b=9;

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public Object divide(int a, int b) {
		System.out.println("Parent Demo..");
		return a / b;
	}
}

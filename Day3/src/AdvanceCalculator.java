
public class AdvanceCalculator extends Calculator {

	public int factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public Number divide(int a, int b) {
		System.out.println("child divide..");
		return a / b;
		
	}
}

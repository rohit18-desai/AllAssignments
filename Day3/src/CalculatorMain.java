
public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c =new Calculator();
		AdvanceCalculator ac= new AdvanceCalculator();
		ac.a=20;
		//System.out.println(c.add(12, 10));
	//	System.out.println(ac.factorial(5));
	//	System.out.println(ac.multiply(11,11));
	//	System.out.println(c.a);
	//	System.out.println(ac.a);
	//	System.out.println(ac.b);
	//	ac.b=20;
	//	System.out.println(c.b);
	//	System.out.println(ac.b);
		Calculator c1=new AdvanceCalculator();
		System.out.println(c1.divide(50, 2));
		
		System.out.println(c1.add(50,10));
	}

}

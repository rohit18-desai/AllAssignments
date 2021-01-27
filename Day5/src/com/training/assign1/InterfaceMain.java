package com.training.assign1;

public class InterfaceMain {

	public static void main(String[] args) {

		MyInterface mc = new MyClass();
		System.out.println(mc.performAction(10, 20));
		MyInterface ms = new MySecondClass();
		System.out.println(ms.performAction(100, 50));

		MyInterface add = new MyInterface() {

			@Override
			public int performAction(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		MyInterface sub = new MyInterface() { //annonymous inner class - 
			public int performAction(int a, int b) {
				return a - b;
			}
		};
		
		System.out.println("Anno class :"+add.performAction(10, 30));
		
		MyInterface multi = (a,b)->{System.out.println("Lambda");return a*b;};
		
		System.out.println("lambda class :"+multi.performAction(10, 30));
	}

}

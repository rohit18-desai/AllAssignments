package com.training.inherutance;

public class TestEmployee {

	public static void main(String[] args) {
		//Emp e = new Emp(1,"Hulk",20000,600);
		//e.showEmpDetails();
		Emp e1=new Manager();
		e1.setBasicSalary(20000);
		e1.showEmpDetails();
		final int a[]= {1,2,3,5};
		System.out.println(a[0]);
		
		int a1=4;
		Integer x=66;
		String s="123";
		int m=Integer.parseInt(s);
		System.out.println(m);
		
		Integer y=new Integer(a1);
		a1=x.intValue();
		System.out.println(a1);
		

	}

}

package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Address a1 = new Address("Pune", 411006);
		Address a2 = new Address("Kolhapur", 416007);
		
		Employee e1 = new Employee(5, "Virat", 30000, a1);
		Employee e2 = new Employee(2, "Dhoni", 45000, a2);
		Employee e3 = new Employee(3, "ROhit", 25000, a2);
		Employee e4= new Employee(1, "Pandya", 25000, a2);
		Employee e5 = new Employee(9, "Bhavi", 25000, a2);
		Employee e6 = new Employee(4, "Raina", 25000, a2);
		
		List<Employee> l= new ArrayList<Employee>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		
		EmpIDCompare eid=new EmpIDCompare();
		Collections.sort(l,eid);
		System.out.println(l);
	}

}

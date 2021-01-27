package com.training.collection;

public class Employee {

	private int eid;
	private String name;
	private double sal;
	
	private Address address;

	public Employee(int eid, String name, double sal, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	
	
	
	
}

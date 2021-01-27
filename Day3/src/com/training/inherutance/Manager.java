package com.training.inherutance;

public class Manager extends Emp {
	private double foodallowance;
	private double managerallowance;
	private double otherallowance;
	
	
	
	
	public Manager() {
		super();
		this.foodallowance = 0.8*getBasicSalary();
		this.managerallowance =  0.10*getBasicSalary();;
		this.otherallowance =  0.3 * getBasicSalary();
	}

	public double calculateFoodAllowance() {
		System.out.println(getBasicSalary());
		return getBasicSalary() * 0.08;
	}
	
	public double calculateManagerAllowance() {
		return getBasicSalary() * 0.10;
	}
	
	public double calculateOtherAllowance() {
		return getBasicSalary() * 0.03;
	}

	public double calculateGrossSalary() {
		return getBasicSalary() + calculateFoodAllowance() + calculateManagerAllowance() + calculateOtherAllowance();
	}
	
	public void showEmpDetails() {
	//	super.showEmpDetails();
		System.out.println("Food Allowance  :"+ calculateFoodAllowance());
		System.out.println("Manager Allowance  :"+ calculateManagerAllowance());
		System.out.println("Other Allowance  :"+ calculateOtherAllowance());
		System.out.println("Gross Allowance  :"+ calculateGrossSalary());
	}
	

}

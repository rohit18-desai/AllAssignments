
public class Emp {
	private int empid;
	private String ename;
	private double basicSalary;
	private double HRA;
	private double PF;
	private double PT;
	private double medical;
	private double grossSalary;
	private double netSalary;
	
	public Emp() {
		System.out.println("Default Constructor");
		empid=0;
		ename=null;
		basicSalary=0;
		HRA=0;
		PF=0;
		PT=0;
		medical=0;
		grossSalary=0;
		netSalary=0;
	}

	public Emp(int empid, String ename, double basicSalary, double medical) {
		this.empid = empid;
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.medical = medical;
		this.HRA=0.5 * basicSalary;
		this.PF=0.12* basicSalary;
		this.PT = 200;
	}
	
	public double calculateGrossSalary() {
		return this.basicSalary + this.HRA + this.medical;
	}
	
	public double calculateNetSalary() {
		return calculateGrossSalary() - PF + PT;
	}
	
	public void showEmpDetails() {
		System.out.println("ID  :"+empid);
		System.out.println("Name  :"+empid);
		System.out.println("basicSalary  :"+basicSalary);
		System.out.println("Medical  :"+medical);
		System.out.println("HRA :"+HRA);
		System.out.println("PF :"+PF);
		System.out.println("PT :"+PT);
		System.out.println("GrossSalary :"+calculateGrossSalary());
		System.out.println("NetSalary  :"+calculateNetSalary());
	}
	

}

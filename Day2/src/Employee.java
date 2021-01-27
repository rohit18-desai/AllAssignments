
public class Employee {

	private int id;
	private String name;
	private String address;
	
	public Employee() {
		System.out.println("default constructor");
	}
	public Employee(int a) {
		System.out.println("1 para constructor");
	}

	public Employee(int id,String name,String address) {
		this(id);
		this.id = id;
		this.name = name ;
		this.address=address; 
	}

	public void showData() {
		System.out.println("Id  :" + id);
		System.out.println("Name :" + name);
		System.out.println("Address :" + address);
	}

	public int add(int a, int b) {
		int c = a + b;
		System.out.println("two para..");
		return c;
	}
	public void add(int a) {
		System.out.println("char");
	}

	public float add(float a, int b) {
		return a + b;
	}

	public float add(int a, float b) {
		return a + b;
	}
	
	public void add(int ... a) {
		System.out.println("in var arg");
	}

}

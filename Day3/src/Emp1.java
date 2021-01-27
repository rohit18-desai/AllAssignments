
public class Emp1 {
	private int eid;
	private String name;
	
	static Emp1 e1=null;

	private Emp1() {
		System.out.println("Private Constructor");
	}
	
	static public Emp1 getE1() {
		if(e1==null) {
			e1=new Emp1();
		}
		return e1;
		
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

}

import java.util.ArrayList;
import java.util.List;

public class Emp {
	
	private int eid;
	private String name;
	private double sal;
	List l=new ArrayList();
	
	
	public Emp() {
		super();
	}
	public Emp(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
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
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (eid != other.eid)
			return false;
		return true;
	}
	
	public void addEmp(Emp e) {
		l.add(e);
	}
	
	public List<Emp> getAll(){
		return l;
	}
	public void removeEmp(Emp e) {
		l.remove(e);
	}
	
	public void updateEmp(Emp old,Emp newemp) {
		l.set(l.indexOf(old), newemp);
	}

}

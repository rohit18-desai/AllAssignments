import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

	List s=new ArrayList();
	public void push(T data) {
		s.add(data);
	}
	
	public T pop() {
		T data=(T) s.remove(s.size()-1);
		return data;
		
	}
	
	public void printData() {
		System.out.println(s);
	}
}

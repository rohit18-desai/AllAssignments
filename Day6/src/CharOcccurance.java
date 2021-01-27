import java.util.HashMap;
import java.util.Map;

public class CharOcccurance {

	public static void main(String[] args) {

		String s="aaabssjjklhgggg";
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		char [] ch=s.toCharArray();
		
		for(char c:ch) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}
			else {
				m.put(c,1);
			}
		}
		
		for(Map.Entry entry:m.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//word occurence
		String s1="Hello how are yor hello hello";
		Map<String,Integer> m1 = new HashMap<String, Integer>();
		String arr[]=s1.split(" ");
		
		for(String x:arr) {
			m1.merge(x,1,CharOcccurance::add);
		}
		System.out.println(m1);
		
		
	}
	
	static Integer add(Integer a, Integer b) {
		return a + b;
	}

	//end word occurence
}


public class ReverseString {

	public static void main(String[] args) {
		String s = "Thinkitive";
		String rev ="";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println("Original String  :" + s);
		System.out.println("Reverse String  :" + rev);
	}

}

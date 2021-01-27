
public class ReverseEveryWorld {

	public static void main(String[] args) {
		       
		        String s = "Hello how are you";
		 
		        String words[] = s.split(" ");
		        String rev = "";
		 
		        for (int i = 0; i < words.length; i++) 
		        {
		            String first = words[i];
		            String reverseWord = "";
		            for (int j = first.length() - 1; j >= 0; j--) {
		                reverseWord = reverseWord + first.charAt(j);
		            }
		            rev = rev + reverseWord + " ";
		        }
		 
		        // Displaying the string after reverse
		        System.out.print("Reversed string : " + rev);
		    }
		}


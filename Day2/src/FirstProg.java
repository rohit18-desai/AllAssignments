
public class FirstProg {
	public static void main(String[] args) {
		/*
		 * System.out.println("Hello world..");
		 * 
		 * float per = 34.5f;
		 * 
		 * if (per >= 95) { System.out.println("Pass with desti "); } else if (per >= 60
		 * && per <= 75) { System.out.println("Pass with first class"); } else if (per
		 * >= 35 && per <= 60) { System.out.println("Pass with second class"); } else {
		 * System.out.println("Failed"); }
		 */

		// facto
		/*
		 * int fact = 5; int total = 1; for (int i = 1; i <= fact; i++) { total = total
		 * * i; } System.out.println(total);
		 */
		
		
		  //find prime no. give array 
		int flag=0;
		int prime[]=new int[10];
		int t=0;
		int [] arr = {10,20,2,51,3,11,18,17,15}; 
		for(int i=0;i<arr.length;i++) {
			flag=0;
			for(int j=2;j<arr[i];j++) { 
				if(arr[i]%j==0) {
					flag=1;
					break;
		       } 
				if(flag == 1) {
					prime[t]=arr[i];
					t++;
				}
				}
			}
		
		for(int i=0;i<=t;i++) {
			System.out.println(prime[i]);
		}
		
		
		 
		
		//Check given  two arrays or same or not
		/*
		 * int flag=0; int [] arr11= {1,4,2,3}; int [] arr22= {3,1,2,4}; if(arr11.length
		 * == arr22.length) { for(int i=0;i<arr11.length;i++) { for(int
		 * j=0;j<arr22.length;j++) { if(arr11[i]==arr22[j]) { flag=1; break; } else {
		 * flag=0; } } } }
		 * 
		 * if(flag==0) { System.out.println("Not same"); } else {
		 * System.out.println("same"); }
		 */
	}	
}

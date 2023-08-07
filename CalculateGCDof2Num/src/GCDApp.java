import java.util.Scanner;
public class GCDApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of m and n to calculate GCD:");
		int m = scan.nextInt();
		int n  = scan.nextInt();
		
		
		int res = findGCD(m, n);
		System.out.println("The value of GCD of "+m+ " and "+n+ " is "+res);
		

	}
	
		public static int findGCD(int m , int n) {
			while(n!=0) {
				int rem = m%n;
				
				m=n;
				n=rem;
			}
			int gcd = m;
			return gcd;
		

	}

}

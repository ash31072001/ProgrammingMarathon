
public class FibbonacciSeries {
	public static void series(int n) {
		int fib1 = 0;
		int fib2 = 1;
		
		if(n==fib1) {
			System.out.print(fib1);
		}
		else if(n==fib2) {
			System.out.print(fib1+" "+fib2+" ");
		}
		else {
			System.out.print(fib1+" "+fib2+" ");
			for(int i = 3; i<=n;i++) {
				
				int nextNo = fib1 + fib2;
				System.out.print(nextNo+ " ");
				fib1=fib2;
				fib2=nextNo;
				
			}
			
		}

	}
		
	

}

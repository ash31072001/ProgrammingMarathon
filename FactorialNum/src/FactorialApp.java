import java.util.Scanner;
public class FactorialApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		int res = factorial(n);
		System.out.println("The factorial of "+n+" is "+res);

	}
	public static int factorial(int n) {
		int factorial = 1;
		for(int i = n;i>=1;i--) {
			factorial = factorial*i;
		}
		return factorial;
	}

}

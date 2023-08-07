import java.util.Scanner;
public class FibonacciApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number upto which series is to be calculated : ");
		int n = scan.nextInt();
		FibbonacciSeries.series(n);
	}
}	

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		int num = scan.nextInt();
		int n = 1;
		
		for(int i = 1;i<=num;i++) {
			n = n*i;
		}
		System.out.println("The value of factorial is : "+n);

	}

}

import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		
			if(num<2 || num%2 ==0) {
				System.out.println("Not a prime number");
				
			}
			else {
				System.out.println("The number is prime");
			}
		
		

	}

}

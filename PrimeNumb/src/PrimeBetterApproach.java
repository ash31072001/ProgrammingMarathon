import java.util.Scanner;
public class PrimeBetterApproach {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		boolean flag = false;
		for(int i = 2;i<=(num/2);i++ ) {
			if(num%i==0) {
				flag = true;
				break;
			}
			
			
		}
		if(!flag) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}
		
		

	}

}

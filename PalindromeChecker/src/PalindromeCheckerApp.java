import java.util.Scanner;
public class PalindromeCheckerApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome : ");
		int num = scan.nextInt();
		PalindromeChecker palindromechecker = new PalindromeChecker();
		int rev = palindromechecker.palindrome(num);
		
		if(rev==num) {
			System.out.println("The entered number "+num+" is palindrome");
		}
		else {
			System.out.println("The entered number "+num+" is not a palindrome");
		}
	}

}

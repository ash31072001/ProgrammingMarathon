import java.util.Scanner;
public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number upto which sum is to be printed: ");
		int num =scan.nextInt();
		int sum = 0;
		for(int i = 0;i<=num;i++) {
			sum= sum + i;
		}
		System.out.println("The sum of first "+num+ " natural numbers is "+sum);

	}

}

import java.util.Scanner;
public class ReverseDigitApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scan.nextInt();
		ReverseDigit reversedigit = new ReverseDigit();
		int reverse = reversedigit.digitReverse(num);
		System.out.println("The reverse of the num "+num+ " is "+reverse);
		scan.close();
	}

}

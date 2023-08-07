import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		System.out.println("Enter the number2 : ");
		int n = scan.nextInt();
		
		int m = scan.nextInt();
		checkMultipleOfTen(n,m);
		scan.close(); 

	}
	public static void checkMultipleOfTen(int n , int m) {
		if((n%m ==0)||(m%n == 0)) {
			System.out.println(n+" is a multiple of "+m);
		}
		else {
			System.out.println("Not multiple");
		}
	}

}

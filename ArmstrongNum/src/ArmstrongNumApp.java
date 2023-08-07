import java.util.Scanner;
public class ArmstrongNumApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  number : ");
		int num = scan.nextInt();
		ArmstrongNum armstrong = new ArmstrongNum();
		int res = armstrong.armstrongNum(num) ;
		System.out.println("The result is "+res);
		if(num==res) {
			System.out.println("The number "+num+" is armstrong number");
		}
		else {
			System.out.println("The number "+num+" is not a armstrong number");
		}

	}
  
}

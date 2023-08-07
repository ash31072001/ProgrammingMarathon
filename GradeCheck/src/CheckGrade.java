import java.util.Scanner;
public class CheckGrade {
	public static void checkGrade(int grade) {
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fails");
		}
	}
	



public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the marks : ");
	int grade = scan.nextInt();
	checkGrade(grade);
	
	
}
}
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the product : ");
		String productCode = scan.next();
		getProduct(productCode);
		scan.close();

	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "P01":
			System.out.println("Coca Cola");
			break;
		case "P02": 
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("ThumbsUp");
			break;
		case "P04":
			System.out.println("Breezer");
			break;
		case "P05":
			System.out.println("Fizz");
		default:
			System.out.println("No other drinks available !!");
		}
		
	}

}

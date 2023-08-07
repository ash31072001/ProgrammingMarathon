import java.util.Scanner;
public class PurchaseApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the price :");
		double purchaseAmount = scan.nextDouble();
		Purchase.checkDiscount(purchaseAmount);

	}
	public class Purchase {
		public static void checkDiscount(double purchaseAmount) {
			if(purchaseAmount > 100) {
				System.out.println("Discount Applicable");
			}
			else {
				System.out.println("Discount not Applicable");
			}
		}

	}

}

import java.util.Scanner;
public class ArraysFindNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x = scan.nextInt();
		
		System.out.println("Enter the length of row and column : ");
		int [][]arr = new int [scan.nextInt()][scan.nextInt()];
		
		 for(int i = 0;i<=arr.length-1;i++) {
			 for(int j = 0;j<=arr[i].length-1;j++) {
				 System.out.println("Enter the value of column "+j+" for row "+i);
				 arr[i][j] = scan.nextInt();
			 }
		 }
		 System.out.println("Array contents are .................");
		 
		 for(int i = 0;i<=arr.length-1;i++) {
			 for(int j = 0;j<=arr[i].length-1;j++) {
				 if(arr[i][j]==x) {
					 System.out.println("x is found at row no: "+i+" and column no:"+j);
				 }
			 }
		 }

	}

}

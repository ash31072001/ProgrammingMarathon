package com.Arrays.programs;

import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length : ");
		int []arr = new int [scan.nextInt()];
		    
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.println("Enter the value of index "+i+" :");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are .....................");
		
		for (int a : arr) {
			System.out.print((a+5) +" ");
		}


	}

}

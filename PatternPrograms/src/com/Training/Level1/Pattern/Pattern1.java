package com.Training.Level1.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i = 1; i<=3;i++) {
			for(int j = 1;j<=3;j++) {
				if(i== 2 && j==2) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}

	}

}

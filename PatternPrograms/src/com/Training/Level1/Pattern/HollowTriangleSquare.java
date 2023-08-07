package com.Training.Level1.Pattern;

public class HollowTriangleSquare {

	public static void main(String[] args) {
		int numRows = 3; // Adjust this value to change the number of rows in the pyramid

        // Outer loop for each row
        for (int i = 1; i < numRows; i++) {
            // Print spaces before the stars (to create the pyramid shape)
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars in the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
            	if(k==1 || k == 2*i - 1) {
            		System.out.print("*");
            	}
            	else {
            		System.out.print(" ");
            	}
                
            }
            

            // Move to the next line after printing each row
            System.out.println();
        }
        for(int l = 1; l<=5;l++) {
        	System.out.print("*");
        }
        System.out.println();
        //printing the hollow square ------------------------------>
        int n = 5;
		for(int m = 1; m<=n;m++) {
			for(int p = 1;p<=n;p++) {
				if(m==1||p==1||m==n||p==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

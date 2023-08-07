package com.Wrapper;

import java.util.Arrays;

public class ArrrayAttributes {

	public static void main(String[] args) {
		
		// Length 
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 11, 14};
		int length = numbers.length; // length is 9
		System.out.println(numbers.length);
		
		//sorting 
		int[] numbers1 = {5, 2, 1, 4, 3,9,5,13,20};
		Arrays.sort(numbers1); // numbers is now [1, 2, 3, 4, 5, 9, 13, 20]
		
		
		//toString 
		int[] numbers2 = {1, 2, 3, 4, 5};
		String numbers2String = Arrays.toString(numbers2); // "[1, 2, 3, 4, 5]"
		System.out.println(numbers2String);
		
		//binarySearch 
		int[] numbers3 = {1, 2, 3, 4, 5};
		int index = Arrays.binarySearch(numbers3, 3); // index is 2
		System.out.println(index);
		
		//fill
		int[] numbers4 = new int[5];
		Arrays.fill(numbers4, 0); // numbers4 is now [0, 0, 0, 0, 0]





	}

}

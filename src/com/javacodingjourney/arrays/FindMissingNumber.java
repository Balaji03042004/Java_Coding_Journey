package com.javacodingjourney.arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6 };
		int number=6;
		if (arr != null && arr.length > 0) {

			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					sum = sum + arr[i];
				}
			}

			
			int s = number * (number + 1) / 2;
			int missing_number = s - sum;
			System.out.print(missing_number);

		} else {
			System.out.println("Empty Array");
		}
	}

}

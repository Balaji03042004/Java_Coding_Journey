package com.javacodingjourney.arrays;

public class Second_Largest_Distinct_Element {

	public static void main(String[] args) {
		int[] arr = { -10, -5, -20 };
		if (arr != null && arr.length >= 2) {
			int largest = arr[0];
			int second_largest = Integer.MIN_VALUE;
			boolean isSecondLargest = false;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > largest) {
					second_largest = largest;
					largest = arr[i];
					isSecondLargest = true;

				} else if (arr[i] < largest && (!isSecondLargest || arr[i] > second_largest)) {
					second_largest = arr[i];
					isSecondLargest = true;
				}

			}

			if (isSecondLargest) {
				System.out.println("Largest: " + largest);
				System.out.println("Second Largest: " + second_largest);
			} else if (arr.length == 2 && largest != second_largest) {
				System.out.println("Largest: " + largest);
				System.out.println("Second Largest: " + second_largest);

			} else {
				System.out.println("Second largest distinct element does not exist.");
			}

		} else {
			System.out.println("Not able to find the Second Element.");
		}
	}

}

package com.javacodingjourney.arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		boolean present = true;
		search: // this label both loops at a time
		if (arr != null && arr.length >= 2) {

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + arr[j] == target) {
						System.out.println("Indices:" + i + " " + j);
						System.out.println("Values:" + arr[i] + " " + arr[j]);
						present = false;
						break search;
					}
				}

			}

			if (present) {
				System.out.println("No target found.");
			}
		} else

		{
			System.out.println("Invalid Array.");
		}

	}

}

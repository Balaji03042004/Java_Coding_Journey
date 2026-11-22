package com.javacodingjourney.arrays;

public class ThirdLargestElement {

	public static void main(String[] args) {
		int[] arr = {10, 25, 8, 42, 17, 42, 5, 30};
		boolean second = false;

		int Largest = arr[0];
		int Second_largest = Integer.MIN_VALUE;
		int Third_largest =Integer.MIN_VALUE;
		if (arr.length >= 3) {
			for (int i = 1; i < arr.length; i++) {

				if (arr[i] > Largest) {
					second = true;
					Third_largest=Second_largest;
					Second_largest = Largest;
					Largest = arr[i];

				} else if (arr[i] < Largest && arr[i] > Second_largest ) {
					second = true;
					
					Second_largest = arr[i];
				}

			}
			System.out.println("Largest" + Largest);

			if (Largest != Second_largest && second) {
				System.out.println("Second_Largest" + Second_largest);
				System.out.println("Third_largest" + Third_largest);
			} else {
				System.out.println("No Second Largest");
			}
		}

	}// TODO Auto-generated method stub

}

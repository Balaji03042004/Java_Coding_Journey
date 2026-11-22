package com.javacodingjourney.arrays;

import java.util.*;

public class TwoSumBaseHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 2, 4};
		int target = 6;
       if(arr!=null && arr.length>=2)
       {
		HashSet<Integer> mp = new HashSet<>();
		int i;
		int number = 0;
		int a = 0;
		while (a < arr.length) {
			mp.add(arr[a]);
			a++;
		}

//		for (int o : arr) {
//
//			number = target - o;
//			if (mp.contains(number)) {
//				System.out.println("Indices:" + l.indexOf(o) + " " + l.indexOf(number));
//				System.out.println("Values:" + o + " " + number);
//				break;
//			}
//			// System.out.println(o);
//		}
		int b = 0;
		int p = 0;
		for (i = 0; i < arr.length - 1; i++) {
			number = target - arr[i];
			if (number > 0) {
				if (mp.contains(number)) {
					p = arr[i];
					b = number;
					System.out.println("Values:" + arr[i] + " " + number);
					break;
				}
			}
			number = 0;
		}
		int r = -1;
		int y = -1;
		int z = 0;
		while (z < arr.length) {
			if (p == arr[z]) {
				y = z;
			}

			if (b == arr[z]) {
				r = z;
			}
			z++;
		}
		System.out.println("Indices:" + y + " " + r);
		
       }
       else
       {
    	   System.out.println("Invalid Array.");
       }

	}

}

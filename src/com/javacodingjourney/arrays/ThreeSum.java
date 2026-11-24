package com.javacodingjourney.arrays;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {-1, 0, 1, 2, -1, -4};
		
		int sum=0;
		int[] d=new int[3];
		HashSet<String> hs=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int z=j+1;z<arr.length;z++)
				{
					
					sum+=arr[i]+arr[j]+arr[z];
					if (sum == 0) {
						// To avoid duplicate triplets, create a temporary array
						// containing the three elements whose sum is zero.

						// Sort the temporary array so that the same triplet
						// always has a consistent order, regardless of the
						// original positions of its elements.

						// Convert the sorted array into a String representation
						// because Java arrays do not compare their contents
						// directly when used as HashSet elements.

						// Add the String representation to the HashSet.
						// HashSet automatically prevents duplicate entries,
						// ensuring that each unique triplet is stored only once.

					    d[0] = arr[i];
					    d[1] = arr[j];
					    d[2] = arr[z];

					    Arrays.sort(d);
					    String A = Arrays.toString(d);
					    hs.add(A);
					}
					sum=0;
				}
			}
		}
		
		for(String s:hs)
		{
			System.out.print(s);
		}

	}

}

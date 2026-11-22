package com.javacodingjourney.arrays;

import java.util.*;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 2, 5 };
		int a = 0;

		HashSet<Integer> mp = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (mp.contains(arr[i])) {
				System.out.println(arr[i]);
			} else {
				mp.add(arr[i]);
			}

		}

//		int n=5;
//		int [] l= new int[5];
//		int count=0;
//		int s=0;
//		for(int i=1;i<=n;i++)
//		{
//		    for(int j=0;j<arr.length;j++)
//		    {
//		    	if(arr[j]==i)
//		    	{
//		    		l[s]=++count;
//		    	}
//		    }
//		    count=0;
//		    s++;
//		}
//		
//		for(int i=0;i<n;i++)
//		{
//			if(l[i]>1)
//			{
//			System.out.print(l[i]+"--->");
//			System.out.println(i+1);
//			}
//			
//		}

	}
}

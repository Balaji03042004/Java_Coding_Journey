package com.javacodingjourney.arrays;
import java.util.*;


public class TwoSumBaseHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4, 6, 3, 8};
		int target = 11;
		// like we do target-currentelement =complement 
		// so we store current element as key and then values as index of cuurent element
		
		HashMap<Integer,Integer> mp =new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int Complement=target-arr[i];
			if(mp.containsKey(Complement))
			{
				System.out.println("Indices:" + i + " " + mp.get(Complement));
				System.out.println("Values:" + arr[i] + " " + Complement);
				break;
			}
			else
			{
				mp.put(arr[i], i);
			}
		}
		

	}

}

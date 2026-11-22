package com.javacodingjourney.arrays;

public class Floyds_cycle_finding_algorithm {
	//Hare-Tortoise algorithm
	
	public static void main(String[] args)
	{
//		Floyd's Cycle Detection Algorithm is also known as the Tortoise and Hare Algorithm.
//
//		It is used to detect a cycle in a sequence and find the starting point (entrance) of that cycle.
//
//		In DSA, it is commonly used to find a duplicate number in an array without using extra space.
		
//		Slow Pointer (Tortoise): Moves one step at a time.	
//		Fast Pointer (Hare): Moves two steps at a time.
		
		int[] arr = { 1, 3, 4, 2, 2};
		
		int slow=0;
		int fast=0;
		do {
		slow=arr[slow];
		fast=arr[arr[fast]];
		}while(fast!=slow);
		
		slow=0;
		while(fast!=slow)
		{
			slow=arr[slow];
			fast=arr[fast];
			
		}
		System.out.print(slow);
		
		
	}

}

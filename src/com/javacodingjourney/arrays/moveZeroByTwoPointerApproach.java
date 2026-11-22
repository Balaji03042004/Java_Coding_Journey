package com.javacodingjourney.arrays;

public class moveZeroByTwoPointerApproach {
	
	public static void main(String[] args)
	{
		int[] arr= {1,0,4,0,5,60,7,0};
		
		moveZero(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static void moveZero(int[] arr)
	{
		int nonzeroindex=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[nonzeroindex]=arr[i];
				nonzeroindex++;
			}
		}
		
		while(nonzeroindex<arr.length)
		{
			arr[nonzeroindex]=0;
			nonzeroindex++;
		}
	}
}

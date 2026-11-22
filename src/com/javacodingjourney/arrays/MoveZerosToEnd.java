package com.javacodingjourney.arrays;

public class MoveZerosToEnd {
	
	public static void main(String[] args)
	{
		int[] arr = {0,1,0,3,12};
		if(arr.length>0)
		{
			moveZero(arr);
		}
		else
		{
			System.out.println("Array length is Less than one number.");
		}
		
		
	}
	public static void moveZero(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]==0)
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		
		}
	}

}

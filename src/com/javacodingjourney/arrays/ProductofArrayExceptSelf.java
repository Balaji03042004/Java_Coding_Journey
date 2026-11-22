package com.javacodingjourney.arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,2,0,4};
		int a=0;
		int[] num= new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int mul=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					mul=mul*arr[j];
				}
			}
			num[i]=mul;
		}
		
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}

	}

}

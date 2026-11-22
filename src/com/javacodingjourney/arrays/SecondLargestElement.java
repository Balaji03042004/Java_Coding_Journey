package com.javacodingjourney.arrays;

public class SecondLargestElement {

	public static void main(String[] args)
	{
		int[] arr =  {10,1};
		boolean second =false;
		
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				}
//			}
//		}
//		int len=arr.length;
//		int largest =arr[len-1];
//		int count =len-2;
//		for(int i=len-1;i>=0;i--)
//		{
//            
//			if(largest!=arr[count])
//			{
//			  System.out.println("Second Largest:"+arr[count]);
//			  break;
//			}
//			else
//			{
//				count--;
//			}
//		}
		
		
		int Largest = arr[0];
		int Second_largest = Integer.MIN_VALUE;
		if(arr.length>=2)
		{
			for (int i = 1; i < arr.length; i++) {

				if(arr[i]>Largest)
				{
					second=true;
					Second_largest=Largest;
					Largest=arr[i];
					
				}
				else if(arr[i]<Largest && arr[i]>Second_largest )
				{
					second=true;
					Second_largest=arr[i];
				}

			}
			System.out.println("Largest"+Largest);
			
			if(Largest!=Second_largest && second)
			{
			System.out.println("Second_Largest"+Second_largest);
			}
			else
			{
				System.out.println("No Second Largest");
			}
		}
		
		
		
	}
}

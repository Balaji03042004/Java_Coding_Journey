package com.javacodingjourney.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1, 2, 6, 4, 5, 3, 8, 9,7};
//		int largest =a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>largest)
//			{
//				largest =a[i];
//			}
//		}
		//System.out.println("Largest Element"+largest);
//	int value=1;
//	for(int i=0;i<largest;i++)
//	{
//		if(value==a[i])
//		{
//			value++;
//			if(value==largest)
//			{
//				System.out.print("No Missing Numbers in Array.");
//				break;
//			}
//			continue;
//			
//		}
//		
//		else
//		{
//			System.out.print("Missing Number"+value);
//			break;
//			
//		}
//	}
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter N value ");
	int n =sc.nextInt();
	if (a.length != n - 1) {
	    System.out.println("Invalid input: Array must contain N-1 elements.");
	    return;
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	int value=1;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==value)
		{
			value++;
			continue;
		}
		else
		{
			System.out.print("Missing Number"+value);
			break;
		}
	}
	
	if(n>a[a.length-1])
	{
		System.out.print("Missing Number is "+n);
	}
	if(value==n)
	{
		System.out.print("No Missing Number");
	}
	
	}
	
	

}

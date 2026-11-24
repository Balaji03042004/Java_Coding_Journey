package com.javacodingjourney.arrays;
import java.util.*;

public class ThreeSumTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1, 0, 1, 2, -1, -4};
		int left=0;
		int right=arr.length-1;
		int sum=0;
		int[] d=new int[3];
		HashSet<String>hs=new HashSet<>();
		
//		for(int i=0;i<arr.length;i++)
//		{
//			left=i+1;
//			while(left<right)
//			{
//				sum=sum+arr[i]+arr[left]+arr[right];
//				if(sum==0)
//				{
//					d[0]=arr[i];
//					d[1]=arr[left];
//					d[2]=arr[right];
//					System.out.print(d);
//					
//					Arrays.sort(d);
//					
//					String A=d.toString();
//					hs.add(A);
//					
//					
//				}
//				
//				if(arr[left]<arr[right])
//				{
//					left++;
//				}
//				else
//				{
//					right--;
//				}
//				sum=0;
//			}
//			
//		}
//		
		
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 2; i++) {

		    left = i + 1;
		    right = arr.length - 1;
		    if(i>0 && arr[i]==arr[i-1])
		    {
		    	continue;
		    }
		    while (left < right) {

		        sum = arr[i] + arr[left] + arr[right];

		        if (sum < 0) {
		            left++;
		        }
		        else if (sum > 0) {
		            right--;
		        }
		        else {
		            d[0] = arr[i];
		            d[1] = arr[left];
		            d[2] = arr[right];

		           // Arrays.sort(d);
		            String triplet = Arrays.toString(d);
		            hs.add(triplet);

		            left++;
		            right--;
		        }
		    }
		    
		}
		
		for(String s:hs)
		{
			System.out.print(s);
		}

	}

}

package com.javacodingjourney.arrays;

public class TrappingRainWaterTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] height = {3, 0, 2, 0, 4};
		int left=0;
		int right=height.length-1;
		int leftMax = 0;
		int rightMax = 0;
		int sum = 0;
		int water=0;
		
		while(left<right)
		{
			water=0;
			if(height[left]<height[right])
			{
			leftMax = Math.max(leftMax, height[left]);
               water=leftMax-height[left];
               sum+=water;
			left++;
			}
			else
			{
				rightMax = Math.max(rightMax, height[right]);
				water=rightMax-height[right];
				sum+=water;
				right--;
			}
			
			
		}
		
		System.out.print(sum);
		

	}

}

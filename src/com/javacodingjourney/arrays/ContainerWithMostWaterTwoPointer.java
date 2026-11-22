package com.javacodingjourney.arrays;

public class ContainerWithMostWaterTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] height = {1, 2, 3, 4, 5};
		int start=0;
		int end=height.length-1;
		int maxArea=0;
		
		while(start<end)
		{
			int width=end-start;
			int minHeight = Math.min(height[start], height[end]);
			int area = width * minHeight;
			if (area > maxArea) {
				maxArea = area;
			}
			if(height[start]<height[end])
			{
				start++;
			}
			else
			{
				end--;
			}
		}
		
		System.out.print(maxArea);
		

	}

}

package com.javacodingjourney.arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] height = {3, 0, 2, 0, 4};
		int leftmax=0;
		int rightmax=0;
		int sum=0;
		for(int i=1;i<height.length-1;i++)
		{
			rightmax=0;
			leftmax=0;
			for(int j=0;j<=i;j++)
			{
				leftmax=Math.max(height[j], leftmax);			
			}
			
			for(int j=i+1;j<height.length;j++)
			{
				rightmax=Math.max(height[j], rightmax);			
			}
			
			int waterlevel = Math.min(leftmax, rightmax) - height[i];
			sum+=waterlevel;
				 
		}
		
		System.out.print(sum);

	}

}

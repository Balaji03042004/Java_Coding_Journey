package com.javacodingjourney.arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

//		width=right index-left index (distance btw two walls)
//		hieght=min(left,right); (hiegth of two walls)
//		Area=width*hieght;
		int maxArea = 0;

		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int width = j - i;
				int minHeight = Math.min(height[i], height[j]);
				int area = width * minHeight;
				if (area > maxArea) {
					maxArea = area;
				}

			}
		}

		System.out.print(maxArea);

	}

}

package com.javacodingjourney.arrays;

/*
 * PROBLEM: Find the maximum sum of a contiguous subarray.
 *
 * APPROACH: BRUTE FORCE
 *
 * 1. Use two loops:
 *    - Outer loop (i) selects the starting index.
 *    - Inner loop (j) extends the subarray from that starting index.
 *
 * 2. For every new starting index:
 *    - Initialize sum = arr[i].
 *    - Reset sum because every starting position represents
 *      a new subarray.
 *
 * 3. IMPORTANT: Check the single-element subarray first.
 *    - Example: [-8, -3, -6, -2]
 *    - If we don't check arr[i] directly, we may miss the
 *      maximum when all elements are negative.
 *
 * 4. Extend the current subarray:
 *    - Add the next element to the existing sum.
 *    - sum = sum + arr[j].
 *    - Do not reset sum inside the inner loop.
 *
 * 5. Compare the running sum with MaxSum:
 *    - If sum > MaxSum, update MaxSum.
 *    - Store the starting index (start = i).
 *    - Store the ending index (end = j).
 *
 * 6. After both loops:
 *    - MaxSum contains the maximum subarray sum.
 *    - start and end identify the subarray boundaries.
 *    - Print elements from start to end (inclusive).
 *
 * IMPORTANT POINTS I INITIALLY MISSED:
 *
 * - Do not hardcode the expected maximum sum.
 * - Initialize MaxSum = arr[0], not 0.
 *   This handles arrays containing only negative numbers.
 * - Reset sum for every new starting index.
 * - Add arr[j] BEFORE comparing sum with MaxSum.
 * - Do not add the next element only inside an else block.
 * - Check the initial single-element sum before the inner loop.
 * - Use i <= end when printing the subarray.
 *
 * TIME COMPLEXITY: O(n^2)
 * SPACE COMPLEXITY: O(1)
 *
 * EXAMPLE:
 * Input: {-2, 1, -3, 4, -1, 2, 1, -5, 4}
 * Maximum Sum: 6
 * Maximum Subarray: {4, -1, 2, 1}
 * Starting Index: 3
 * Ending Index: 6
 */
public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int MaxSum=arr[0];
		int start=0;
		int end=0;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=arr[i];
			// this case for all are negative inputs
			if(sum > MaxSum)
			{
			    MaxSum = sum;
			    start = i;
			    end = i;
			}
			for(int j=i+1;j<arr.length;j++)
			{
			
				sum=sum+arr[j];
				if(sum>MaxSum)
				{
					MaxSum=sum;
					System.out.println("Maximum Sum: " + MaxSum);
					System.out.println("Start Index: " + start);
					System.out.println("End Index: " + end);
					start=i;
					end=j;
				}
				
				
			}
		}
		
		System.out.println(start+""+end);
		
		for(int i=start;i<=end;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}


package com.javacodingjourney.arrays;

public class KadanesAlgorithm {

    public static void main(String[] args) {

        /*
         * ==========================================
         * KADANE'S ALGORITHM
         * ==========================================
         *
         * Purpose:
         * Find the maximum sum of a contiguous
         * subarray and identify its starting and
         * ending indexes.
         *
         * Example:
         * arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4}
         *
         * Maximum Subarray = {4, -1, 2, 1}
         * Maximum Sum = 6
         *
         * ------------------------------------------
         * APPROACH:
         * ------------------------------------------
         *
         * At every array element, we have two choices:
         *
         * 1. START FRESH:
         *    Take only the current element.
         *    currentSum = arr[i];
         *
         * 2. CONTINUE:
         *    Add the current element to the previous sum.
         *    currentSum = currentSum + arr[i];
         *
         * Compare both choices and select the larger sum.
         *
         * Logic:
         * currentSum = Math.max(arr[i],
         *                       currentSum + arr[i]);
         *
         * ------------------------------------------
         * VARIABLES:
         * ------------------------------------------
         *
         * currentSum:
         * Best subarray sum ending at the current index.
         *
         * maxSum:
         * Maximum subarray sum found so far.
         *
         * tempStart:
         * Potential starting index when starting fresh.
         *
         * start:
         * Starting index of the maximum subarray.
         *
         * end:
         * Ending index of the maximum subarray.
         *
         * ------------------------------------------
         * INDEX TRACKING:
         * ------------------------------------------
         *
         * When START FRESH:
         * currentSum = arr[i];
         * tempStart = i;
         *
         * When CONTINUING:
         * currentSum = currentSum + arr[i];
         * Do not change tempStart.
         *
         * When a NEW MAXIMUM is found:
         * maxSum = currentSum;
         * start = tempStart;
         * end = i;
         *
         * ------------------------------------------
         * INITIALIZATION:
         * ------------------------------------------
         *
         * currentSum = arr[0];
         * maxSum = arr[0];
         *
         * Initialize with the first element to
         * correctly handle all-negative arrays.
         *
         * Start loop from i = 1 because arr[0]
         * is already considered.
         *
         * ------------------------------------------
         * COMMON MISTAKES:
         * ------------------------------------------
         *
         * 1. Comparing arr[i] > currentSum is WRONG.
         *    Correct comparison:
         *    arr[i] > currentSum + arr[i]
         *
         * 2. Do not calculate currentSum twice
         *    using both Math.max() and if-else.
         *
         * 3. Update tempStart only when starting fresh.
         *
         * 4. Update start and end only when a new
         *    maximum sum is found.
         *
         * 5. Use i <= end when printing the subarray
         *    because the ending index is inclusive.
         *
         * ------------------------------------------
         * COMPLEXITY:
         * ------------------------------------------
         *
         * Time Complexity: O(n)
         * Extra Space Complexity: O(1)
         *
         * ==========================================
         */

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int start = 0;
        int end = 0;
        int tempStart = 0;

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Decide whether to start fresh or continue
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum = currentSum + arr[i];
            }

            // Update maximum sum and subarray indexes
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Sum: " + maxSum);

        System.out.print("Maximum Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Start Index: " + start);
        System.out.println("End Index: " + end);
    }
}

package com.javacodingjourney.arrays;

public class ProductofArrayExceptSelfOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 2, 5, 4 };
//		PREFIX= 1
//		THEN FIRST 1 BZ BEFORE NO ELEMENT AND THEN 3 WE NEED TO SKIP SO 1
//		2 BEFORE 3 SO INSTEAD OF 2 IS 3
//		5 BEFORE 2,3 SO 6
//		4 BEFORE 3,2,5 S0 30
//		PREFIX
//		{1,3,6,30}
//		SUFFIX
//		LAST IS BEGIN
//		4 NEXT NO ELEMENT SO INSTEAD OF 4 IS 1
//		5 NEXT 4 SO 4
//		2 NEXT 5,4 SO 20
//		3 NEXT 2,5,4 SO 40
//		{40,20,4,1}
//		RESULT
//		{40,60,24,30}
		int result[] = new int[arr.length];

		int prefix = 1;
		for (int i = 0; i < arr.length; i++) {
			result[i] = prefix;
			prefix = prefix * arr[i];
		}
		int suffix = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			result[i] = result[i] * suffix;
			suffix = suffix * arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(result[i] + " ");
		}

//		int a=1;
//		for(int i=0;i<arr.length;i++)
//		{
//			a=a*arr[i];
//		}
//		int l=0;
//		while(l<arr.length)
//		{
//			result[l++]=a;
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			int res=result[i]/arr[i];
//			result[i]=res;
//			System.out.print(result[i]+" ");
//		}

	}

}

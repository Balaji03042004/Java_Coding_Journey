package com.javacodingjourney.arrays;

public class BestTimetoBuyandSellStockOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices ={2, 4, 1};
		int max_profit = 0;
		
		int profit=0;
		boolean   transactionPossible = false;
		if(prices!=null && prices.length>=2)
		{
			int minprice=prices[0];
		for(int j=1;j<prices.length;j++)
		{
			profit=prices[j]-minprice;
			if(profit>max_profit)
			{
				max_profit=profit;
				transactionPossible = true;
			}
			if(prices[j]<minprice)
			{
				minprice=prices[j];
				
				
			}
		}
			if (transactionPossible) {
			    System.out.println("Maximum Profit: " + max_profit);
			} else {
			    System.out.println("No profitable transaction possible.");
			}
		}
		else
		{
			System.out.print("Invalid Prices Array.");
		}

	}

}

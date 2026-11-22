package com.javacodingjourney.arrays;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int max_profit = 0;
		int buyprice = 0;
		int sellprice = 0;
		int amount = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				amount = prices[j] - prices[i];
				if (amount > max_profit) {
					max_profit=amount;
					buyprice=prices[i];
					sellprice = prices[j];

				}

			}
		}
		System.out.println("Maximum Profit: " + max_profit);
        System.out.println("Buy Price: " + buyprice);
        System.out.println("Sell Price: " + sellprice);

	}

}

package com.stockprice;

public class PickBestStockPrice {

	public static void main(String[] args) {
		int[] stockPrices = {1000,8,700,6,100,20,0,25,5};
		
		int maxProfit = getProfit(0, stockPrices.length -1, stockPrices);

		System.out.println("Max profit: " + maxProfit);
	}

	private static int getProfit(int i, int j, int[] stockPrices) {
		// TODO Auto-generated method stub
		return 0;
	}

}

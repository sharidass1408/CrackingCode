//https://www.programcreek.com/2014/02/leetcode-best-time-to-buy-and-sell-stock-java/
package com.stockbuyingselling;

public class MaxProfitStockSelling {

	public static void main(String[] args) {

		int[] stocks = {1000,10,300,2,400,50};
		
		System.out.println(maxProfit(stocks));
	}
	
	public static int maxProfit(int[] prices) {
	    if(prices==null||prices.length<=1)
	        return 0;
	 
	    int min=prices[0]; // min so far
	    int result=0;
	 
	    for(int i=1; i<prices.length; i++){
	        result = Math.max(result, prices[i]-min);
	        min = Math.min(min, prices[i]);
	    }
	 
	    return result;
	}

}

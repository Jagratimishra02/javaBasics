/* Buy & Sell Stocks
Question:
You are given an array prices where prices[i] is the price of a given stock on the i-th day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future
 to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example:
prices = [7, 1, 5, 3, 6, 4]

Formula:
profit = Sell - Buy
(Buy low ↓, Sell high ↑) */

public class BuyAndSellStocks {
    public static int buyAndsellstocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE ;
        int maxprofit = 0;
        int bestbuy = 0;
        int bestsell = 0;
        for(int i = 0 ; i < prices.length ;i++){
            if (buyPrice < prices [i]) {                 // profit 
                int profit = prices[i]-buyPrice ;        // todays profit 
                // maxprofit = Math.max(maxprofit,profit);
                if(maxprofit < profit){
                    maxprofit = profit;
                    bestbuy = buyPrice;
                    bestsell = prices[i];
                }
            } else {
                buyPrice = prices[i];                // if price(selling price)< buyprice ,so update buyprice = price 
            }
        }

        System.out.println("Buy price : " + bestbuy);
        System.out.println("Sell price : " + bestsell);
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("max profit is : " + buyAndsellstocks(prices));
    }
}

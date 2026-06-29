/* Question 3: You are given an array prices where prices[i] is the price of a given stock on the iᵗʰ day.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:

Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7, 6, 4, 3, 1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Constraints:
1 <= prices.length <= 10⁵
0 <= prices[i] <= 10⁴ */


//_______________   time complexity of this code is O(n), which is optimal solution .

import java.util.*;
public class ArrayQues2 {
    public static int tocalculateprofit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0 ;
        for (int i = 0 ; i< prices.length ; i++){
            if(prices[i] > buyPrice){
                // find profit 
               int profit = prices[i]-buyPrice ;
               if (profit> maxProfit)
               maxProfit = profit;
          } else {
                buyPrice = prices[i];
               }
        }
       return maxProfit ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your arrays length");
        int n = sc.nextInt();
        int[] prices = new int[n] ;
        // input
        System.out.println("Enter elements of array :");
        for (int i =0 ; i < prices.length ; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println("max profit is " + tocalculateprofit(prices));
    }
}

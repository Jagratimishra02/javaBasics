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

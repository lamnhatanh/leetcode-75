package Array;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfitOptimalSolution(new int[] {7,3,5,3,6,4}));
        System.out.println(maxProfitSlidingWindowSolution(new int[] {7,9,5,1,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }
        }
        return max_profit;
    }

    // Easy way to understand ***
    public static int maxProfitOptimalSolution(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= minPrice) {
                minPrice = prices[i];
            } else if (prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

    public static int maxProfitSlidingWindowSolution(int[] prices) {
        int maxProfit = 0;
        int L = 0;
        int R = 1;

        while (R < prices.length) {
            if (prices[L] > prices[R]) {
                L = R;
            } else {
                maxProfit = Math.max(maxProfit, prices[R] - prices[L]);
            }
            R++;
        }
        return maxProfit;
    }
}

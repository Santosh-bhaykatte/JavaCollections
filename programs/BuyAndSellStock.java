package javaCollections.programs;

public class BuyAndSellStock {
    static int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int n = prices.length;
        int buy = prices[0];
        int sell = prices[1];

        int maxProfit = 0;
        for (int i = 1; i < n; ++i) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = buy;
            } else {
                sell = prices[i];
            }
            int profit = sell-buy;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {3, 2, 6, 1, 4};
        System.out.println("Max profit: "+ maxProfit(prices));
    }
}

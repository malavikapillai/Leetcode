class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int sumprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            // Buy if a lower price is found
            // loss case means buy today
            if (buyprice > prices[i]) {
                buyprice = prices[i];
            } 
            // Sell if profit can be made
            else if (prices[i] > buyprice) {
                int profit=prices[i]-buyprice;
                sumprofit += profit;
                buyprice = prices[i]; // buy again at current price for next transaction
            }
        }

        return sumprofit;
    }
}

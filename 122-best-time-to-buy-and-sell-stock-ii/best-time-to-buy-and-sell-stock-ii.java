class Solution {
    public int maxProfit(int[] prices) {

        int buyprice=Integer.MAX_VALUE;
        int sumprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice>prices[i])
            {
                buyprice=prices[i];
            }
            else if(prices[i]>buyprice)
            {
                int profit=prices[i]-buyprice;
                sumprofit+=profit;
                buyprice=prices[i];
               
            }
        }
        return sumprofit;

        
    }
}
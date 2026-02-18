class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i =1; i < prices.length; i++) {
            // Update the lowest price we've seen so far
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            // Otherwise, see if selling today gives us a better profit
            else {
                int currentProfit = prices[i] - minPrice;
                if(currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
        
    }
}
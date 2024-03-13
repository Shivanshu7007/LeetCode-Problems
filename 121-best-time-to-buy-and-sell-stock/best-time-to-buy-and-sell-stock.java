class Solution {
    public int maxProfit(int[] prices) {
        // Initialize variables to keep track of minimum price and maximum profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        // Iterate through the prices
        for (int price : prices) {
            // Update the minimum price encountered so far
            minPrice = Math.min(minPrice, price);
            // Calculate the potential profit if we sell at the current price
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        
        return maxProfit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int profit = 0;
        int l = 0;
        int r = 1;

        while(l < r){
            if(r == prices.length-1){
                int v = prices[r] - prices[l];
                profit = Math.max(v, profit);
                l++;
                continue;

            }
            if(prices[l] > prices[r]){
                l++;
                r++;
                continue;
            }if(prices[l]< prices[r] || prices[l] == prices[r]){
                int v = prices[r] - prices[l];
                profit = Math.max(v, profit);
                r++;
                continue;
            }

        }
        return profit;
    }
}

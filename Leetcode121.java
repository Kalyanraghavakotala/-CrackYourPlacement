class Solution {
    public int maxProfit(int[] prices) {
        int p=0, m = prices[0];
        for(int i=1;i<prices.length;i++){
            
            p=Math.max(prices[i] - m,p);
            m=Math.min(m,prices[i]);

        }
        return p;
    }
}

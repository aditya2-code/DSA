class Solution {
    public int maxProfit(int[] prices) {
        int smPrice = prices[0];
        int maxprofit = 0;
        for (int i = 0; i<prices.length ; i++){
            int curr = prices[i];
            if( maxprofit < curr-smPrice){
                maxprofit = curr-smPrice;
            }
            if(curr< smPrice){
                smPrice = curr;
            }
        }
        return maxprofit;
        
    }
}
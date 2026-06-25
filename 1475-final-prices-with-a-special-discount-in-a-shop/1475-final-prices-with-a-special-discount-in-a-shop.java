class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res  =new int [prices.length];
        for(int i = 0 ; i < prices.length;i++){
            res[i] = prices[i];
        }
        Stack<Integer> ms = new Stack<>();
        for(int i = 0; i< prices.length; i++){
            while(!ms.isEmpty() && prices[i]<=prices[ms.peek()]){
                int idx = ms.pop();
                res[idx] -= prices[i]; 
            }
            ms.push(i);
        }
        return res;
        
    }
}
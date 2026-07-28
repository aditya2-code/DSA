class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> h = new HashSet<>();
        for(int num : nums){
            h.add(num);
        }
        int ans = 0;
        for(int num : h){
            if(!h.contains(num-1)){
                int numm = num;
                int curr = 1;
                while(h.contains(numm+1)){
                    numm++;
                    curr++;
                }
                ans = Math.max(ans,curr);
            }
        }
        return ans;
    }
}
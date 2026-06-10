class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i<nums.length; i++){
            curr += nums[i];
            if(curr<0){
                curr = 0;
            }
            if(curr> max){
                max = curr;
            }
        }
        if(max == 0){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        return max;
    }
}
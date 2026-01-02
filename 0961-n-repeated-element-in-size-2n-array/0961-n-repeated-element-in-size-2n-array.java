class Solution {
    public int repeatedNTimes(int[] nums) {
        int n= nums.length/2;
        int count;
        for(int i = 0; i<nums.length; i++){
            count =0;
            for(int j = 0; j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count==n){
                return nums[i];
            }
        }
        return -1;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count;
        for(int i =0; i<n; i++){
            count=0;
            for(int j = i+1; j<n; j++){
                if(nums[i] ==nums[j]){
                    count++;
                }
            }
            if(count>=n/2){
                return nums[i];
            }
        }
        return -1;
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
        int s = 1;
        int end = n - 2;
        
        while (s <= end) {
            int mid = s + (end - s) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || 
                (mid % 2 != 0 && nums[mid] == nums[mid - 1])){
                s = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1; // Fix 1: Correct boundary
        
        while (start <= end) {
            // Fix 2: Recalculate mid inside the loop
            int mid = start + (end - start) / 2; 
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // Check if the left half is normally sorted
            if (nums[start] <= nums[mid]) {
                // Fix 3: Properly check if target lies within the sorted left half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // Search left
                } else {
                    start = mid + 1; // Search right
                }
            } 
            // Otherwise, the right half must be normally sorted
            else {
                // Check if target lies within the sorted right half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // Search right
                } else {
                    end = mid - 1; // Search left
                }
            }
        }
        
        return -1; // Target not found
    }
}
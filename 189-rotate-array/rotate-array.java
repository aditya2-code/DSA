class Solution {
    public void rotate(int[] nums, int k) {
        // Fix: Handle cases where k is greater than the array length
        k = k % nums.length;
        
        int[] arr = new int[nums.length];
        
        // Copy the last k elements to the front of the temp array
        for(int i = nums.length - k, j = 0; i < nums.length && j < k; i++, j++){
            arr[j] = nums[i];
        }
        
        // Copy the remaining elements to the back of the temp array
        for(int i = 0, j = k; i < nums.length - k && j < nums.length; i++, j++){
            arr[j] = nums[i];
        }
        
        // Copy the temporary array back into the original array
        for(int i = 0; i < nums.length; i++){
            nums[i] = arr[i];
        }
    }
}
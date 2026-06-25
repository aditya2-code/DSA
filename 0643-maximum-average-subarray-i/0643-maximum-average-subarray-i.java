class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Compute the sum of the first window of size k
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        
        // Track the maximum sum found so far
        double maxSum = currentSum;
        
        // Step 2: Slide the window across the rest of the array
        for (int i = k; i < nums.length; i++) {
            // Add the incoming element and subtract the outgoing element
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Step 3: Divide by k at the very end to get the maximum average
        return maxSum / k;
    }
}
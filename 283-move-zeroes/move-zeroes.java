class Solution {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap elements at writePointer and i
                int temp = nums[writePointer];
                nums[writePointer] = nums[i];
                nums[i] = temp;
                
                // Move the write pointer to the next position
                writePointer++;
            }
        }
    }
}
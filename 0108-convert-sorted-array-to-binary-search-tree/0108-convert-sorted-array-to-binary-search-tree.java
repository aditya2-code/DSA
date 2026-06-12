class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Handle edge case
        if (nums == null || nums.length == 0) {
            return null;
        }
        // Kick off the helper function covering the entire array
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        // Base case: if left pointer crosses right, we've run out of elements
        if (left > right) {
            return null;
        }

        // Always pick the middle element to ensure height balance
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);

        return root;
    }
}
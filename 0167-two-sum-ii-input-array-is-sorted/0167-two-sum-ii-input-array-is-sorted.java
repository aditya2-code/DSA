class Solution {
    public int[] twoSum(int[] n, int t) {
        int i = 0;
        int j = n.length - 1;

        while (i < j) {
            int sum = n[i] + n[j];

            if (sum < t) {
                i++;
            } else if (sum > t) {
                j--;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }

        return new int[]{};
    }
}
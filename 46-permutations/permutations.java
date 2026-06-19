class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permut(nums, 0, res);
        return res;
    }
    private void permut(int[] nums, int i,List<List<Integer>>res){
        if(i == nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int num:nums){
                permutation.add(num);
            }
            res.add(permutation);
            return;
        }
        for(int j = i; j<nums.length;j++){
            swap(nums,i,j);
            permut(nums,i+1,res);
            swap(nums,i,j);
        }
    }
    private void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] =nums[j];
        nums[j] = temp;
    }
}
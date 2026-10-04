class Solution {
    public void sortColors(int[] nums) {
        int [] freq = new int[3];
        for(int i = 0; i< nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i= 0; i< freq[0]; i++){
            nums[i]=0;
        }
        for(int i= freq[0]; i< freq[0]+freq[1]; i++){
            nums[i]=1;
        }
        for(int i= freq[0]+freq[1]; i< freq[0]+freq[1]+freq[2]; i++){
            nums[i]=2;
        }
    }
}
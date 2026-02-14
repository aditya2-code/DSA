class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i = 0; i<count0; i++){
            nums[i]=0;
        }
        for(int j= count0; j<count1+count0; j++){
            nums[j]=1;
        }
        for(int k=count1+count0; k<nums.length; k++){
            nums[k]=2;
        }
    }
}
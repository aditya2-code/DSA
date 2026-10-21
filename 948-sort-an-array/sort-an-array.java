class Solution {
    public int[] MergeTwoArray(int[] left, int[] right){
        int i =0,j=0,k=0;
        int[] mergedArray = new int[left.length+right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                mergedArray[k++] = left[i++];
            else
                mergedArray[k++] = right[j++];
        }

        while (i < left.length)
            mergedArray[k++] = left[i++];

        while (j < right.length)
            mergedArray[k++] = right[j++];

        return mergedArray;
    }
    public int[] MergeSort(int[] nums, int s, int e){
        if(s==e) return new int[]{nums[s]};

        int mid = s+(e-s)/2;
        int[] left = MergeSort(nums,s,mid);
        int[] right = MergeSort(nums,mid+1,e);

        return MergeTwoArray(left,right);
    }
    public int[] sortArray(int[] nums) {
        return MergeSort(nums,0,nums.length-1);
    }
}
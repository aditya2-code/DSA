class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0,j=0,k=0;
        int num3[] = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                num3[k++]=nums1[i++];
            }
            else{
                num3[k++]=nums2[j++];
            }
        }
        while(i<m){
            num3[k++]=nums1[i++];
        }
        while(j<n){
            num3[k++]=nums2[j++];
        }
        for(int a = 0; a<nums1.length; a++){
            nums1[a]=num3[a];
        }
    }
}
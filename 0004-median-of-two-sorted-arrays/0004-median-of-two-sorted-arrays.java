class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merge = new ArrayList<>();
        for(int num: nums1){
            merge.add(num);
        }
        for(int num: nums2){
            merge.add(num);
        }
        Collections.sort(merge);
        int size = merge.size();
        
        double ans;
        if(size%2==0){
            ans = (merge.get(size/2)+merge.get(size/2-1))/2.00;
        }else{
            ans = merge.get(size/2);
        }
        return ans;
    }
}
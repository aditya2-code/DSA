class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n-1;
        int max = 0;
        int minLength = 0;
        while(start<end){
            minLength= Math.min(height[start],height[end]);
            int vol = minLength*(end-start);
            if(vol>max){
                max = vol;
            }
            if(minLength == height[start]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}
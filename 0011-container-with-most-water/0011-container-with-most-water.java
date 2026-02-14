class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n-1;
        int max= 0;
        int minLength = 0;
        for(int i = 0; i<n; i++){
            minLength = Math.min(height[start],height[end]);
            int curr = minLength*(end-start);
            max = Math.max(curr,max);
            if(minLength == height[start]){
                start +=1; 
            }
            else{
                end -=1;
            }
        }
        return max;
    }
}
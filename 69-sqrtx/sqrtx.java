class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int s = 1;
        int end = x;
        int mid =-1;
        while(s<=end){
            mid = s+(end-s)/2;
            if((long)mid*mid>(long)x){
                end = mid-1;
            }else if(mid*mid== x){
                return mid;
            }else{
                s = mid+1;
            }
        }
        return Math.round(end);
    }
}
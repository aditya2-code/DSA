class Solution {
    public String largestOddNumber(String num) {
        int end = 0;
        for(int i = num.length()-1; i>=0; i--){
            if(isOdd((int) num.charAt(i))){
                end = i+1;
                break;
            }
        }
        return num.substring(0,end);
    }
    private boolean isOdd(int x){
        if(x%2!=0){
            return true;
        }
        return false;
    }
}